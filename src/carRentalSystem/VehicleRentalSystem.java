package carRentalSystem;

import java.util.List;
import java.util.Optional;

public class VehicleRentalSystem
{
    private List<Store> stores;
    private List<User> users;

    public VehicleRentalSystem(List<Store> stores, List<User> users)
    {
        this.stores = stores;
        this.users = users;
    }

    public List<Store> getStore(Location location)
    {
        return stores.stream().filter(store -> store.getLocation().equals(location)).toList();
    }

    public Optional<Store> findStoreById(int storeId)
    {
        return stores.stream().filter(store -> store.getId() == storeId).findFirst();
    }

    public Optional<User> findUserByDrivingLicense(String license)
    {
        return users.stream().filter(user -> license.equals(user.getDrivingLicense())).findFirst();
    }

    public void addUser(User user)
    {
        users.add(user);
    }

    public void removeUser(User user)
    {
        users.remove(user);
    }

    public void addStore(Store store)
    {
        stores.add(store);
    }

    public void removeStore(Store store)
    {
        stores.remove(store);
    }
}
