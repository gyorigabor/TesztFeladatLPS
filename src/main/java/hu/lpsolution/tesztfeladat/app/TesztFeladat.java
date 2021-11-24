package hu.lpsolution.tesztfeladat.app;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class TesztFeladat {
    public static void main(String[] args) throws IOException {
        new TesztFeladat();
    }

    public TesztFeladat() throws IOException {
        File templateFile = new TemplateBuilder().getTemplate();
        Configuration cfg = new Configuration(new Version("2.3.31"));
        cfg.setDefaultEncoding("Cp1250");
        cfg.setOutputEncoding("Cp1250");
        FileTemplateLoader templateLoader = new FileTemplateLoader(new File(templateFile.getParent()));
        cfg.setTemplateLoader(templateLoader);

        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        Template template = cfg.getTemplate("template.ftl");
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("nev_param", "Győri Gábor");
        modelMap.put("email_param", "gyorigabormail@gmail.com");
        modelMap.put("repo_url", "https://github.com/gyorigabor/TesztFeladatLPS");

        Writer fileWriter = new FileWriter("src/main/resources/output.html");

        try {
            template.process(modelMap, fileWriter);
        } catch (TemplateException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
        templateFile.delete();
    }
}
