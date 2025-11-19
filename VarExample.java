public class VarExample {

    interface Printable {
        void print();
    }

    static class Message implements Printable {
        private String message;

        Message(String msg) {
            this.message = msg;
        }

        public void print() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        var msg = new Message("Практика #8: использование var и интерфейса");
        msg.print();
    }
}
