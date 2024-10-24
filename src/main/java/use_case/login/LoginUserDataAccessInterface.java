package use_case.login;

import entity.User;

/**
 * DAO for the Login Use Case.
 */
public interface LoginUserDataAccessInterface {

    /**
     * Checks if the given username exists.
     * @param username the username to look for
     * @return true if a user with the given username exists; false otherwise
     */
    boolean existsByName(String username);

    /**
     * Saves the user.
     * @param user the user to save
     */
    void save(User user);

    /**
     * Returns the user with the given username.
     * @param username the username to look up
     * @return the user with the given username
     */
    User get(String username);

    /**
     * Sets the current user based on the provided username.
     * @param name the username of the user to set as the current user
     */
    void setCurrentUser(String name);

    /**
     * Retrieves the username of the currently authenticated user.
     * @return the username of the current user, or null if no user is currently
     *         set as authenticated
     */
    String getCurrentUser();
}
