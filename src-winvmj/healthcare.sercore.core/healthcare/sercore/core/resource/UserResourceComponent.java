package healthcare.sercore.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class UserResourceComponent implements UserResource{
	
	public UserResourceComponent() { }
 
    public abstract User createUser(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> updateUser(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> getUser(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAllUser(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> deleteUser(VMJExchange vmjExchange);

}
