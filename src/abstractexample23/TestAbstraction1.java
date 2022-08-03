package abstractexample23;

 class TestAbstraction1 {
     public static void main(String[] args) {
         Shape s = new Circle1();
         s.draw();
         Shape s1 = new Rectangle();
         s1.draw();
     }
}
