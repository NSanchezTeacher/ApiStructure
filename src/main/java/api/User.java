package api;

import dto.UserDTO;
import server.DatabaseAccess;

import java.util.Map;

public class User extends DatabaseAccess {

    @Override
    public Object select(Map params) {
        return null;
    }

    @Override
    public Object insert(Object data) {
        return new UserDTO("Nelo", 33);
    }

    @Override
    public Object delete(Map params) {
        return null;
    }

    @Override
    public Object update(Map params, Object data) {
        return null;
    }
}
