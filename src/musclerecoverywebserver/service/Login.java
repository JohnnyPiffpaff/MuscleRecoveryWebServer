package musclerecoverywebserver.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import musclerecoverywebserver.hibernateutil.HibernateUtil;
import musclerecoverywebserver.model.Tbluser;

public class Login {

	public boolean checkLoginCredentials(String emailaddress, String password) {
		Tbluser user = getUserByMailAddress(emailaddress);
		if (user != null && user.getEmailaddress().equals(emailaddress)
				&& user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public Tbluser getUserByMailAddress(String emailaddress) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		Tbluser user = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session
					.createQuery("from Tbluser where emailaddress='"
							+ emailaddress + "'");
			user = (Tbluser) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println(user.toString());
		return user;
	}

	public List<Tbluser> getListOfUsers() {
		List<Tbluser> list = new ArrayList<Tbluser>();
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from tbluser").list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
