package cgginterns.hibernate;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program created" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        //creationg student oject
        Student student = new Student();
        student.setId(1);
        student.setName("divya");
        student.setCity("hyderabad");
        //creating address obbject
        
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("siddipet");
        ad.setOpen(true);
        ad.setX(12.45);
        ad.setAddedDate(new Date());
        
        //reading image file and storing in database
//        try {
//			FileInputStream fis = new FileInputStream("src/main/java/flower3.jpg");
//			byte[] data = new byte[fis.available()];
//			fis.read(data);
//			ad.setImage(data);
//			fis.close();                                 
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(ad);
        session.getTransaction().commit();
        session.close();
    }
}

