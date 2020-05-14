package Zoo;

import Exceptions.ZooException;

import java.lang.reflect.InvocationTargetException;

public class AnimalFactory {
    private static final String PACKAGE_NAME = AnimalFactory.class.getPackageName();

    public static Animal getAnimal(String animalClassName) throws ZooException {
        try {
            return (Animal) Class.forName(PACKAGE_NAME + "." + animalClassName).getConstructor().newInstance();
        }
        catch (ClassNotFoundException exception) {
            throw new ZooException("Class '" + animalClassName + "' is not found in " + PACKAGE_NAME + " package");
        }
        catch (ClassCastException exception) {
            throw new ZooException("Class '" + animalClassName + "' is not an instance of Animal");
        }
        catch (NoClassDefFoundError exception) {
            throw new ZooException("Class '" + animalClassName + "not found");
        }
        catch (NoSuchMethodException exception) {
            throw new ZooException("Class '" + animalClassName + "' doesn't have the constructor method we tried to get");
        }
        catch (IllegalAccessException exception) {
            throw new ZooException("The constructor of class '" + animalClassName + "' is not accessible");
        }
        catch (InvocationTargetException exception) {
            throw new ZooException("The constructor of class '" + animalClassName + "' threw an exception during instantiation");
        }
        catch (InstantiationException exception) {
            throw new ZooException("The class '" + animalClassName + "' is abstract and cannot be instantiated");
        }
    }
}