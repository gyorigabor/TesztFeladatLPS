package hu.lpsolution.tesztfeladat.app;

import hu.lpsolution.tesztfeladat.pojos.*;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TemplateBuilder {
    public File getTemplate() throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/main/java/hu/lpsolution/tesztfeladat/app/templates/template.ftl"), StandardCharsets.UTF_8));

        String htmlString = getHtmlString();
        File htmlTemplateFile = new File("src/main/java/hu/lpsolution/tesztfeladat/app/templates/template.ftl");
        FileUtils.writeStringToFile(htmlTemplateFile, htmlString, Charset.forName("Cp1250"));
        return htmlTemplateFile;
    }

    private String getHtmlString() {
        String header = "<!DOCTYPE html>\n";
        StringBuilder sb = new StringBuilder(header);
        Row r1 = new Row().setNev("nev").setErtek("${nev_param}");
        Row r2 = new Row().setNev("email").setErtek("${email_param}");
        Table table = new Table().setRow1(r1).setRow2(r2);
        Body body = new Body().setTable(table).setRepoUrl("${repo_url}");
        Head head = new Head().setNev("${nev_param}");
        Html html = new Html().setHead(head).setBody(body);
        sb.append(html);
        return sb.toString();
    }
}
