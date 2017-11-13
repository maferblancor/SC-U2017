package Manager;

/**
 *
 * This class (Singleton) is meant to manager data across the lifetime of the
 * app
 *
 * @author Miguel Martinez
 */
public class AppManager {

    private static AppManager instance = null;

    private AppManager() {
    }

    public static AppManager getInstance() {

        if (instance == null) {
            instance = new AppManager();
        }

        return instance;
    }
}
