package hu.lpsolution.tesztfeladat.pojos;

public class Html {
    private Head head;
    private Body body;

    public Head getHead() {
        return head;
    }

    public Html setHead(Head head) {
        this.head = head;
        return this;
    }

    public Body getBody() {
        return body;
    }

    public Html setBody(Body body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return "<html>\n" +
                head +
                body +
                "</html>";
    }
}
