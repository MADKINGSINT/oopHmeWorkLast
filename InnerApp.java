package EndProject;

class InnerApp implements Interface {
    Interface v;

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    public InnerApp() {
    }

}
