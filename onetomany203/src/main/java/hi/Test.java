package hi;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Test {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
	//to insert	
//		
//		Sim s1=new Sim();
//		s1.setName("Vi");
//		s1.setType("5G");
//		
//		Sim s2=new Sim();
//		s2.setName("BSNL");
//		s2.setType("3G");
//		
//		List<Sim> sims=new ArrayList<Sim>();
//		sims.add(s2);
//		sims.add(s1);
//		
//		Mobile m1=new Mobile();
//		m1.setBrand("realme");
//		m1.setCost(5000);
//		m1.setSims(sims);
//		
//		
//		et.begin();
//		em.persist(m1);
//		em.persist(s1);
//		em.persist(s2);
//		et.commit();
//		
	
		//get by id
		
//		et.begin();
//		Mobile m=em.find(Mobile.class, 1);
//		System.out.println(m);
		
		/*get by name*/
		
		et.begin();
		Query q =em.createQuery("select m from Mobile m where m.brand=?1  ");
		q.setParameter(1, "oppo");
		List<Mobile> m=q.getResultList();
		
		for (Mobile mobile : m) {
			
			System.out.println(mobile);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
