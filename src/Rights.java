public class Rights {

    public static Rights read = new Rights();
    public static Rights write = new Rights();
    public static Rights delete = new Rights();

    /*public Rights(Rights read, Rights write, Rights delete) {
        this.read = read;
        this.write = write;
        this.delete = delete;
    }
    */

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}