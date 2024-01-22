package ra.service;

public interface ICRUD<T,E> {
   void display();
   T findById(E id);

   void edit();
   void delete();

}
