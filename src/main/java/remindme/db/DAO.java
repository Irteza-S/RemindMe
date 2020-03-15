package remindme.db;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import remindme.model.user.User;


public class DAO< T extends Serializable >{
	private Class< T > obj;
	
	@Autowired
    private EntityManager entityManager;
	
	public void setObj( final Class< T > objToSet ){
		obj = objToSet;
	}
	
	public T findOne( final long id ){
		return (T) getCurrentSession()
				.get( obj, id );
	}
	
	@SuppressWarnings("unchecked")
	public List< T > findAll(){
		return getCurrentSession()
				.createQuery( "from " + obj.getName() ).list();
	}
	
	public void save( final T entity ){
		getCurrentSession().persist( entity );
	}
	
	@SuppressWarnings("unchecked")
	public T update( final T entity ){
      return (T) getCurrentSession().merge( entity );
	}
	
	public void delete( final T entity ){
		getCurrentSession().delete( entity );
	}
	
	public void deleteById( final long id ){
      final T entity = findOne( id);
      delete( entity );
	}
	
	public void deleteAll() {
		String stringQuery = "DELETE FROM user";
		Query<User> query = getCurrentSession().createQuery(stringQuery);
		query.executeUpdate();
	}
	
	protected final Session getCurrentSession(){
		return entityManager.unwrap(Session.class);
	}
		
}
