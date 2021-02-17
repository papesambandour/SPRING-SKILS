package presentation;

import dao.DaoImp;
import dao.IDao;
import metier.IMetier;
import metier.MetierImp;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {

     public static void main(String[] args) {
//         DaoImp daoImp = new DaoImp();
//         MetierImp metierImp = new MetierImp();
//         metierImp.setiDao(daoImp);
//         System.out.println(metierImp.calcule());
         try {
             Scanner scanner = new Scanner(new File("config.txt"));
             String daoClassName = scanner.next();
             String metierClassName = scanner.next();
//             System.out.println(daoClassName);
//             System.out.println(metierClassName);
             //Instacie DOA
             Class cDao =  Class.forName(daoClassName);
             IDao dao = (IDao) cDao.newInstance();
             //instacie Metier
             Class cMetier =  Class.forName(metierClassName);
             IMetier metier = (IMetier) cMetier.newInstance();
             Method m1 = cMetier.getMethod("setDao",new Class[]{IDao.class});
             m1.invoke(metier,new Object[]{dao});
             System.out.println(metier.calcule());
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         } catch (InstantiationException e) {
             e.printStackTrace();
         } catch (NoSuchMethodException e) {
             e.printStackTrace();
         } catch (InvocationTargetException e) {
             e.printStackTrace();
         }
     }
}
