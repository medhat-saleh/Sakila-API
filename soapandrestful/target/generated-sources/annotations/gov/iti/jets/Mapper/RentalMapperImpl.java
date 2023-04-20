package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Actordto;
import gov.iti.jets.DTOS.Addressdto;
import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.DTOS.Citydto;
import gov.iti.jets.DTOS.Countrydto;
import gov.iti.jets.DTOS.Customerdto;
import gov.iti.jets.DTOS.FilmActordto;
import gov.iti.jets.DTOS.FilmCategoryIddto;
import gov.iti.jets.DTOS.FilmCategorydto;
import gov.iti.jets.DTOS.Filmdto;
import gov.iti.jets.DTOS.Inventorydto;
import gov.iti.jets.DTOS.Languagedto;
import gov.iti.jets.DTOS.Paymentdto;
import gov.iti.jets.DTOS.Rentaldto;
import gov.iti.jets.DTOS.Staffdto;
import gov.iti.jets.DTOS.Storedto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Address;
import gov.iti.jets.entity.Category;
import gov.iti.jets.entity.City;
import gov.iti.jets.entity.Country;
import gov.iti.jets.entity.Customer;
import gov.iti.jets.entity.Film;
import gov.iti.jets.entity.FilmActor;
import gov.iti.jets.entity.FilmCategory;
import gov.iti.jets.entity.FilmCategoryId;
import gov.iti.jets.entity.Inventory;
import gov.iti.jets.entity.Language;
import gov.iti.jets.entity.Payment;
import gov.iti.jets.entity.Rental;
import gov.iti.jets.entity.Staff;
import gov.iti.jets.entity.Store;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T03:47:03+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class RentalMapperImpl implements RentalMapper {

    @Override
    public Rentaldto todto(Rental rental) {
        if ( rental == null ) {
            return null;
        }

        Rentaldto rentaldto = new Rentaldto();

        rentaldto.setCustomer( customerToCustomerdto( rental.getCustomer() ) );
        rentaldto.setInventory( inventoryToInventorydto( rental.getInventory() ) );
        rentaldto.setLastUpdate( rental.getLastUpdate() );
        rentaldto.setPayments( paymentSetToPaymentdtoSet( rental.getPayments() ) );
        rentaldto.setRentalDate( rental.getRentalDate() );
        rentaldto.setRentalId( rental.getRentalId() );
        rentaldto.setReturnDate( rental.getReturnDate() );
        rentaldto.setStaff( staffToStaffdto( rental.getStaff() ) );

        return rentaldto;
    }

    @Override
    public Rental toentity(Rentaldto rentaldto) {
        if ( rentaldto == null ) {
            return null;
        }

        Rental rental = new Rental();

        rental.setRentalId( rentaldto.getRentalId() );
        rental.setStaff( staffdtoToStaff( rentaldto.getStaff() ) );
        rental.setInventory( inventorydtoToInventory( rentaldto.getInventory() ) );
        rental.setCustomer( customerdtoToCustomer( rentaldto.getCustomer() ) );
        rental.setRentalDate( rentaldto.getRentalDate() );
        rental.setReturnDate( rentaldto.getReturnDate() );
        rental.setLastUpdate( rentaldto.getLastUpdate() );
        rental.setPayments( paymentdtoSetToPaymentSet( rentaldto.getPayments() ) );

        return rental;
    }

    protected Set<Addressdto> addressSetToAddressdtoSet(Set<Address> set) {
        if ( set == null ) {
            return null;
        }

        Set<Addressdto> set1 = new LinkedHashSet<Addressdto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Address address : set ) {
            set1.add( addressToAddressdto( address ) );
        }

        return set1;
    }

    protected Set<Citydto> citySetToCitydtoSet(Set<City> set) {
        if ( set == null ) {
            return null;
        }

        Set<Citydto> set1 = new LinkedHashSet<Citydto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( City city : set ) {
            set1.add( cityToCitydto( city ) );
        }

        return set1;
    }

    protected Countrydto countryToCountrydto(Country country) {
        if ( country == null ) {
            return null;
        }

        Countrydto countrydto = new Countrydto();

        countrydto.setCities( citySetToCitydtoSet( country.getCities() ) );
        countrydto.setCountry( country.getCountry() );
        countrydto.setCountryId( country.getCountryId() );
        countrydto.setLastUpdate( country.getLastUpdate() );

        return countrydto;
    }

    protected Citydto cityToCitydto(City city) {
        if ( city == null ) {
            return null;
        }

        Citydto citydto = new Citydto();

        citydto.setAddresses( addressSetToAddressdtoSet( city.getAddresses() ) );
        citydto.setCity( city.getCity() );
        citydto.setCityId( city.getCityId() );
        citydto.setCountry( countryToCountrydto( city.getCountry() ) );
        citydto.setLastUpdate( city.getLastUpdate() );

        return citydto;
    }

    protected Set<Customerdto> customerSetToCustomerdtoSet(Set<Customer> set) {
        if ( set == null ) {
            return null;
        }

        Set<Customerdto> set1 = new LinkedHashSet<Customerdto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Customer customer : set ) {
            set1.add( customerToCustomerdto( customer ) );
        }

        return set1;
    }

    protected Paymentdto paymentToPaymentdto(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        Paymentdto paymentdto = new Paymentdto();

        paymentdto.setAmount( payment.getAmount() );
        paymentdto.setCustomer( customerToCustomerdto( payment.getCustomer() ) );
        paymentdto.setLastUpdate( payment.getLastUpdate() );
        paymentdto.setPaymentDate( payment.getPaymentDate() );
        paymentdto.setPaymentId( payment.getPaymentId() );
        paymentdto.setRental( todto( payment.getRental() ) );
        paymentdto.setStaff( staffToStaffdto( payment.getStaff() ) );

        return paymentdto;
    }

    protected Set<Paymentdto> paymentSetToPaymentdtoSet(Set<Payment> set) {
        if ( set == null ) {
            return null;
        }

        Set<Paymentdto> set1 = new LinkedHashSet<Paymentdto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Payment payment : set ) {
            set1.add( paymentToPaymentdto( payment ) );
        }

        return set1;
    }

    protected Set<Rentaldto> rentalSetToRentaldtoSet(Set<Rental> set) {
        if ( set == null ) {
            return null;
        }

        Set<Rentaldto> set1 = new LinkedHashSet<Rentaldto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Rental rental : set ) {
            set1.add( todto( rental ) );
        }

        return set1;
    }

    protected List<FilmActordto> filmActorSetToFilmActordtoList(Set<FilmActor> set) {
        if ( set == null ) {
            return null;
        }

        List<FilmActordto> list = new ArrayList<FilmActordto>( set.size() );
        for ( FilmActor filmActor : set ) {
            list.add( filmActorToFilmActordto( filmActor ) );
        }

        return list;
    }

    protected Actordto actorToActordto(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        Actordto actordto = new Actordto();

        actordto.setActorId( actor.getActorId() );
        actordto.setFilmActors( filmActorSetToFilmActordtoList( actor.getFilmActors() ) );
        actordto.setFirstName( actor.getFirstName() );
        actordto.setLastName( actor.getLastName() );
        actordto.setLastUpdate( actor.getLastUpdate() );

        return actordto;
    }

    protected FilmActordto filmActorToFilmActordto(FilmActor filmActor) {
        if ( filmActor == null ) {
            return null;
        }

        FilmActordto filmActordto = new FilmActordto();

        filmActordto.setActor( actorToActordto( filmActor.getActor() ) );
        filmActordto.setFilm( filmToFilmdto( filmActor.getFilm() ) );
        filmActordto.setId( filmActor.getId() );
        filmActordto.setLastUpdate( filmActor.getLastUpdate() );

        return filmActordto;
    }

    protected Set<FilmActordto> filmActorSetToFilmActordtoSet(Set<FilmActor> set) {
        if ( set == null ) {
            return null;
        }

        Set<FilmActordto> set1 = new LinkedHashSet<FilmActordto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FilmActor filmActor : set ) {
            set1.add( filmActorToFilmActordto( filmActor ) );
        }

        return set1;
    }

    protected Set<FilmCategorydto> filmCategorySetToFilmCategorydtoSet(Set<FilmCategory> set) {
        if ( set == null ) {
            return null;
        }

        Set<FilmCategorydto> set1 = new LinkedHashSet<FilmCategorydto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FilmCategory filmCategory : set ) {
            set1.add( filmCategoryToFilmCategorydto( filmCategory ) );
        }

        return set1;
    }

    protected Categorydto categoryToCategorydto(Category category) {
        if ( category == null ) {
            return null;
        }

        Categorydto categorydto = new Categorydto();

        categorydto.setCategoryId( category.getCategoryId() );
        categorydto.setFilmCategories( filmCategorySetToFilmCategorydtoSet( category.getFilmCategories() ) );
        categorydto.setLastUpdate( category.getLastUpdate() );
        categorydto.setName( category.getName() );

        return categorydto;
    }

    protected FilmCategoryIddto filmCategoryIdToFilmCategoryIddto(FilmCategoryId filmCategoryId) {
        if ( filmCategoryId == null ) {
            return null;
        }

        FilmCategoryIddto filmCategoryIddto = new FilmCategoryIddto();

        filmCategoryIddto.setCategoryId( filmCategoryId.getCategoryId() );
        filmCategoryIddto.setFilmId( filmCategoryId.getFilmId() );

        return filmCategoryIddto;
    }

    protected FilmCategorydto filmCategoryToFilmCategorydto(FilmCategory filmCategory) {
        if ( filmCategory == null ) {
            return null;
        }

        FilmCategorydto filmCategorydto = new FilmCategorydto();

        filmCategorydto.setCategory( categoryToCategorydto( filmCategory.getCategory() ) );
        filmCategorydto.setFilm( filmToFilmdto( filmCategory.getFilm() ) );
        filmCategorydto.setId( filmCategoryIdToFilmCategoryIddto( filmCategory.getId() ) );
        filmCategorydto.setLastUpdate( filmCategory.getLastUpdate() );

        return filmCategorydto;
    }

    protected Set<Inventorydto> inventorySetToInventorydtoSet(Set<Inventory> set) {
        if ( set == null ) {
            return null;
        }

        Set<Inventorydto> set1 = new LinkedHashSet<Inventorydto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Inventory inventory : set ) {
            set1.add( inventoryToInventorydto( inventory ) );
        }

        return set1;
    }

    protected Set<Filmdto> filmSetToFilmdtoSet(Set<Film> set) {
        if ( set == null ) {
            return null;
        }

        Set<Filmdto> set1 = new LinkedHashSet<Filmdto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Film film : set ) {
            set1.add( filmToFilmdto( film ) );
        }

        return set1;
    }

    protected Languagedto languageToLanguagedto(Language language) {
        if ( language == null ) {
            return null;
        }

        Languagedto languagedto = new Languagedto();

        languagedto.setFilmsForLanguageId( filmSetToFilmdtoSet( language.getFilmsForLanguageId() ) );
        languagedto.setFilmsForOriginalLanguageId( filmSetToFilmdtoSet( language.getFilmsForOriginalLanguageId() ) );
        languagedto.setLanguageId( language.getLanguageId() );
        languagedto.setLastUpdate( language.getLastUpdate() );
        languagedto.setName( language.getName() );

        return languagedto;
    }

    protected Filmdto filmToFilmdto(Film film) {
        if ( film == null ) {
            return null;
        }

        Filmdto filmdto = new Filmdto();

        filmdto.setDescription( film.getDescription() );
        filmdto.setFilmActors( filmActorSetToFilmActordtoSet( film.getFilmActors() ) );
        filmdto.setFilmCategories( filmCategorySetToFilmCategorydtoSet( film.getFilmCategories() ) );
        filmdto.setFilmId( film.getFilmId() );
        filmdto.setInventories( inventorySetToInventorydtoSet( film.getInventories() ) );
        filmdto.setLanguageByLanguageId( languageToLanguagedto( film.getLanguageByLanguageId() ) );
        filmdto.setLanguageByOriginalLanguageId( languageToLanguagedto( film.getLanguageByOriginalLanguageId() ) );
        filmdto.setLastUpdate( film.getLastUpdate() );
        filmdto.setLength( film.getLength() );
        filmdto.setRating( film.getRating() );
        filmdto.setReleaseYear( film.getReleaseYear() );
        filmdto.setRentalDuration( film.getRentalDuration() );
        filmdto.setRentalRate( film.getRentalRate() );
        filmdto.setReplacementCost( film.getReplacementCost() );
        filmdto.setSpecialFeatures( film.getSpecialFeatures() );
        filmdto.setTitle( film.getTitle() );

        return filmdto;
    }

    protected Inventorydto inventoryToInventorydto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        Inventorydto inventorydto = new Inventorydto();

        inventorydto.setFilm( filmToFilmdto( inventory.getFilm() ) );
        inventorydto.setInventoryId( inventory.getInventoryId() );
        inventorydto.setLastUpdate( inventory.getLastUpdate() );
        inventorydto.setRentals( rentalSetToRentaldtoSet( inventory.getRentals() ) );
        inventorydto.setStore( storeToStoredto( inventory.getStore() ) );

        return inventorydto;
    }

    protected Set<Staffdto> staffSetToStaffdtoSet(Set<Staff> set) {
        if ( set == null ) {
            return null;
        }

        Set<Staffdto> set1 = new LinkedHashSet<Staffdto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Staff staff : set ) {
            set1.add( staffToStaffdto( staff ) );
        }

        return set1;
    }

    protected Storedto storeToStoredto(Store store) {
        if ( store == null ) {
            return null;
        }

        Storedto storedto = new Storedto();

        storedto.setAddress( addressToAddressdto( store.getAddress() ) );
        storedto.setCustomers( customerSetToCustomerdtoSet( store.getCustomers() ) );
        storedto.setInventories( inventorySetToInventorydtoSet( store.getInventories() ) );
        storedto.setLastUpdate( store.getLastUpdate() );
        storedto.setStaff( staffToStaffdto( store.getStaff() ) );
        storedto.setStaffs( staffSetToStaffdtoSet( store.getStaffs() ) );
        storedto.setStoreId( store.getStoreId() );

        return storedto;
    }

    protected Set<Storedto> storeSetToStoredtoSet(Set<Store> set) {
        if ( set == null ) {
            return null;
        }

        Set<Storedto> set1 = new LinkedHashSet<Storedto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Store store : set ) {
            set1.add( storeToStoredto( store ) );
        }

        return set1;
    }

    protected Staffdto staffToStaffdto(Staff staff) {
        if ( staff == null ) {
            return null;
        }

        Staffdto staffdto = new Staffdto();

        staffdto.setActive( staff.isActive() );
        staffdto.setAddress( addressToAddressdto( staff.getAddress() ) );
        staffdto.setEmail( staff.getEmail() );
        staffdto.setFirstName( staff.getFirstName() );
        staffdto.setLastName( staff.getLastName() );
        staffdto.setLastUpdate( staff.getLastUpdate() );
        staffdto.setPassword( staff.getPassword() );
        staffdto.setPayments( paymentSetToPaymentdtoSet( staff.getPayments() ) );
        byte[] picture = staff.getPicture();
        if ( picture != null ) {
            staffdto.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        staffdto.setRentals( rentalSetToRentaldtoSet( staff.getRentals() ) );
        staffdto.setStaffId( staff.getStaffId() );
        staffdto.setStore( storeToStoredto( staff.getStore() ) );
        staffdto.setStores( storeSetToStoredtoSet( staff.getStores() ) );
        staffdto.setUsername( staff.getUsername() );

        return staffdto;
    }

    protected Addressdto addressToAddressdto(Address address) {
        if ( address == null ) {
            return null;
        }

        Addressdto addressdto = new Addressdto();

        addressdto.setAddress( address.getAddress() );
        addressdto.setAddress2( address.getAddress2() );
        addressdto.setAddressId( address.getAddressId() );
        addressdto.setCity( cityToCitydto( address.getCity() ) );
        addressdto.setCustomers( customerSetToCustomerdtoSet( address.getCustomers() ) );
        addressdto.setDistrict( address.getDistrict() );
        addressdto.setLastUpdate( address.getLastUpdate() );
        byte[] location = address.getLocation();
        if ( location != null ) {
            addressdto.setLocation( Arrays.copyOf( location, location.length ) );
        }
        addressdto.setPhone( address.getPhone() );
        addressdto.setPostalCode( address.getPostalCode() );
        addressdto.setStaffs( staffSetToStaffdtoSet( address.getStaffs() ) );
        addressdto.setStores( storeSetToStoredtoSet( address.getStores() ) );

        return addressdto;
    }

    protected Customerdto customerToCustomerdto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Customerdto customerdto = new Customerdto();

        customerdto.setActive( customer.isActive() );
        customerdto.setAddress( addressToAddressdto( customer.getAddress() ) );
        customerdto.setCreateDate( customer.getCreateDate() );
        customerdto.setCustomerId( customer.getCustomerId() );
        customerdto.setEmail( customer.getEmail() );
        customerdto.setFirstName( customer.getFirstName() );
        customerdto.setLastName( customer.getLastName() );
        customerdto.setLastUpdate( customer.getLastUpdate() );
        customerdto.setPayments( paymentSetToPaymentdtoSet( customer.getPayments() ) );
        customerdto.setRentals( rentalSetToRentaldtoSet( customer.getRentals() ) );
        customerdto.setStore( storeToStoredto( customer.getStore() ) );

        return customerdto;
    }

    protected Set<City> citydtoSetToCitySet(Set<Citydto> set) {
        if ( set == null ) {
            return null;
        }

        Set<City> set1 = new LinkedHashSet<City>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Citydto citydto : set ) {
            set1.add( citydtoToCity( citydto ) );
        }

        return set1;
    }

    protected Country countrydtoToCountry(Countrydto countrydto) {
        if ( countrydto == null ) {
            return null;
        }

        Country country = new Country();

        country.setCountryId( countrydto.getCountryId() );
        country.setCountry( countrydto.getCountry() );
        country.setLastUpdate( countrydto.getLastUpdate() );
        country.setCities( citydtoSetToCitySet( countrydto.getCities() ) );

        return country;
    }

    protected Set<Address> addressdtoSetToAddressSet(Set<Addressdto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Address> set1 = new LinkedHashSet<Address>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Addressdto addressdto : set ) {
            set1.add( addressdtoToAddress( addressdto ) );
        }

        return set1;
    }

    protected City citydtoToCity(Citydto citydto) {
        if ( citydto == null ) {
            return null;
        }

        City city = new City();

        city.setCityId( citydto.getCityId() );
        city.setCountry( countrydtoToCountry( citydto.getCountry() ) );
        city.setCity( citydto.getCity() );
        city.setLastUpdate( citydto.getLastUpdate() );
        city.setAddresses( addressdtoSetToAddressSet( citydto.getAddresses() ) );

        return city;
    }

    protected Set<Staff> staffdtoSetToStaffSet(Set<Staffdto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Staff> set1 = new LinkedHashSet<Staff>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Staffdto staffdto : set ) {
            set1.add( staffdtoToStaff( staffdto ) );
        }

        return set1;
    }

    protected Set<Film> filmdtoSetToFilmSet(Set<Filmdto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Film> set1 = new LinkedHashSet<Film>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Filmdto filmdto : set ) {
            set1.add( filmdtoToFilm( filmdto ) );
        }

        return set1;
    }

    protected Language languagedtoToLanguage(Languagedto languagedto) {
        if ( languagedto == null ) {
            return null;
        }

        Language language = new Language();

        language.setLanguageId( languagedto.getLanguageId() );
        language.setName( languagedto.getName() );
        language.setLastUpdate( languagedto.getLastUpdate() );
        language.setFilmsForLanguageId( filmdtoSetToFilmSet( languagedto.getFilmsForLanguageId() ) );
        language.setFilmsForOriginalLanguageId( filmdtoSetToFilmSet( languagedto.getFilmsForOriginalLanguageId() ) );

        return language;
    }

    protected Set<Inventory> inventorydtoSetToInventorySet(Set<Inventorydto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Inventory> set1 = new LinkedHashSet<Inventory>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Inventorydto inventorydto : set ) {
            set1.add( inventorydtoToInventory( inventorydto ) );
        }

        return set1;
    }

    protected Set<FilmActor> filmActordtoListToFilmActorSet(List<FilmActordto> list) {
        if ( list == null ) {
            return null;
        }

        Set<FilmActor> set = new LinkedHashSet<FilmActor>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( FilmActordto filmActordto : list ) {
            set.add( filmActordtoToFilmActor( filmActordto ) );
        }

        return set;
    }

    protected Actor actordtoToActor(Actordto actordto) {
        if ( actordto == null ) {
            return null;
        }

        Actor actor = new Actor();

        actor.setActorId( actordto.getActorId() );
        actor.setFirstName( actordto.getFirstName() );
        actor.setLastName( actordto.getLastName() );
        actor.setLastUpdate( actordto.getLastUpdate() );
        actor.setFilmActors( filmActordtoListToFilmActorSet( actordto.getFilmActors() ) );

        return actor;
    }

    protected FilmActor filmActordtoToFilmActor(FilmActordto filmActordto) {
        if ( filmActordto == null ) {
            return null;
        }

        FilmActor filmActor = new FilmActor();

        filmActor.setId( filmActordto.getId() );
        filmActor.setActor( actordtoToActor( filmActordto.getActor() ) );
        filmActor.setFilm( filmdtoToFilm( filmActordto.getFilm() ) );
        filmActor.setLastUpdate( filmActordto.getLastUpdate() );

        return filmActor;
    }

    protected Set<FilmActor> filmActordtoSetToFilmActorSet(Set<FilmActordto> set) {
        if ( set == null ) {
            return null;
        }

        Set<FilmActor> set1 = new LinkedHashSet<FilmActor>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FilmActordto filmActordto : set ) {
            set1.add( filmActordtoToFilmActor( filmActordto ) );
        }

        return set1;
    }

    protected FilmCategoryId filmCategoryIddtoToFilmCategoryId(FilmCategoryIddto filmCategoryIddto) {
        if ( filmCategoryIddto == null ) {
            return null;
        }

        FilmCategoryId filmCategoryId = new FilmCategoryId();

        filmCategoryId.setCategoryId( filmCategoryIddto.getCategoryId() );
        filmCategoryId.setFilmId( filmCategoryIddto.getFilmId() );

        return filmCategoryId;
    }

    protected Set<FilmCategory> filmCategorydtoSetToFilmCategorySet(Set<FilmCategorydto> set) {
        if ( set == null ) {
            return null;
        }

        Set<FilmCategory> set1 = new LinkedHashSet<FilmCategory>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( FilmCategorydto filmCategorydto : set ) {
            set1.add( filmCategorydtoToFilmCategory( filmCategorydto ) );
        }

        return set1;
    }

    protected Category categorydtoToCategory(Categorydto categorydto) {
        if ( categorydto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( categorydto.getCategoryId() );
        category.setName( categorydto.getName() );
        category.setLastUpdate( categorydto.getLastUpdate() );
        category.setFilmCategories( filmCategorydtoSetToFilmCategorySet( categorydto.getFilmCategories() ) );

        return category;
    }

    protected FilmCategory filmCategorydtoToFilmCategory(FilmCategorydto filmCategorydto) {
        if ( filmCategorydto == null ) {
            return null;
        }

        FilmCategory filmCategory = new FilmCategory();

        filmCategory.setId( filmCategoryIddtoToFilmCategoryId( filmCategorydto.getId() ) );
        filmCategory.setCategory( categorydtoToCategory( filmCategorydto.getCategory() ) );
        filmCategory.setFilm( filmdtoToFilm( filmCategorydto.getFilm() ) );
        filmCategory.setLastUpdate( filmCategorydto.getLastUpdate() );

        return filmCategory;
    }

    protected Film filmdtoToFilm(Filmdto filmdto) {
        if ( filmdto == null ) {
            return null;
        }

        Film film = new Film();

        film.setFilmId( filmdto.getFilmId() );
        film.setLanguageByLanguageId( languagedtoToLanguage( filmdto.getLanguageByLanguageId() ) );
        film.setLanguageByOriginalLanguageId( languagedtoToLanguage( filmdto.getLanguageByOriginalLanguageId() ) );
        film.setTitle( filmdto.getTitle() );
        film.setDescription( filmdto.getDescription() );
        film.setReleaseYear( filmdto.getReleaseYear() );
        film.setRentalDuration( filmdto.getRentalDuration() );
        film.setRentalRate( filmdto.getRentalRate() );
        film.setLength( filmdto.getLength() );
        film.setReplacementCost( filmdto.getReplacementCost() );
        film.setRating( filmdto.getRating() );
        film.setSpecialFeatures( filmdto.getSpecialFeatures() );
        film.setLastUpdate( filmdto.getLastUpdate() );
        film.setInventories( inventorydtoSetToInventorySet( filmdto.getInventories() ) );
        film.setFilmActors( filmActordtoSetToFilmActorSet( filmdto.getFilmActors() ) );
        film.setFilmCategories( filmCategorydtoSetToFilmCategorySet( filmdto.getFilmCategories() ) );

        return film;
    }

    protected Set<Rental> rentaldtoSetToRentalSet(Set<Rentaldto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Rental> set1 = new LinkedHashSet<Rental>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Rentaldto rentaldto : set ) {
            set1.add( toentity( rentaldto ) );
        }

        return set1;
    }

    protected Inventory inventorydtoToInventory(Inventorydto inventorydto) {
        if ( inventorydto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        inventory.setInventoryId( inventorydto.getInventoryId() );
        inventory.setStore( storedtoToStore( inventorydto.getStore() ) );
        inventory.setFilm( filmdtoToFilm( inventorydto.getFilm() ) );
        inventory.setLastUpdate( inventorydto.getLastUpdate() );
        inventory.setRentals( rentaldtoSetToRentalSet( inventorydto.getRentals() ) );

        return inventory;
    }

    protected Set<Customer> customerdtoSetToCustomerSet(Set<Customerdto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Customer> set1 = new LinkedHashSet<Customer>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Customerdto customerdto : set ) {
            set1.add( customerdtoToCustomer( customerdto ) );
        }

        return set1;
    }

    protected Store storedtoToStore(Storedto storedto) {
        if ( storedto == null ) {
            return null;
        }

        Store store = new Store();

        store.setStoreId( storedto.getStoreId() );
        store.setAddress( addressdtoToAddress( storedto.getAddress() ) );
        store.setStaff( staffdtoToStaff( storedto.getStaff() ) );
        store.setLastUpdate( storedto.getLastUpdate() );
        store.setStaffs( staffdtoSetToStaffSet( storedto.getStaffs() ) );
        store.setInventories( inventorydtoSetToInventorySet( storedto.getInventories() ) );
        store.setCustomers( customerdtoSetToCustomerSet( storedto.getCustomers() ) );

        return store;
    }

    protected Payment paymentdtoToPayment(Paymentdto paymentdto) {
        if ( paymentdto == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setPaymentId( paymentdto.getPaymentId() );
        payment.setStaff( staffdtoToStaff( paymentdto.getStaff() ) );
        payment.setRental( toentity( paymentdto.getRental() ) );
        payment.setCustomer( customerdtoToCustomer( paymentdto.getCustomer() ) );
        payment.setAmount( paymentdto.getAmount() );
        payment.setPaymentDate( paymentdto.getPaymentDate() );
        payment.setLastUpdate( paymentdto.getLastUpdate() );

        return payment;
    }

    protected Set<Payment> paymentdtoSetToPaymentSet(Set<Paymentdto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Payment> set1 = new LinkedHashSet<Payment>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Paymentdto paymentdto : set ) {
            set1.add( paymentdtoToPayment( paymentdto ) );
        }

        return set1;
    }

    protected Customer customerdtoToCustomer(Customerdto customerdto) {
        if ( customerdto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerdto.getCustomerId() );
        customer.setAddress( addressdtoToAddress( customerdto.getAddress() ) );
        customer.setStore( storedtoToStore( customerdto.getStore() ) );
        customer.setFirstName( customerdto.getFirstName() );
        customer.setLastName( customerdto.getLastName() );
        customer.setEmail( customerdto.getEmail() );
        customer.setActive( customerdto.isActive() );
        customer.setCreateDate( customerdto.getCreateDate() );
        customer.setLastUpdate( customerdto.getLastUpdate() );
        customer.setPayments( paymentdtoSetToPaymentSet( customerdto.getPayments() ) );
        customer.setRentals( rentaldtoSetToRentalSet( customerdto.getRentals() ) );

        return customer;
    }

    protected Set<Store> storedtoSetToStoreSet(Set<Storedto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Store> set1 = new LinkedHashSet<Store>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Storedto storedto : set ) {
            set1.add( storedtoToStore( storedto ) );
        }

        return set1;
    }

    protected Address addressdtoToAddress(Addressdto addressdto) {
        if ( addressdto == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddressId( addressdto.getAddressId() );
        address.setCity( citydtoToCity( addressdto.getCity() ) );
        address.setAddress( addressdto.getAddress() );
        address.setAddress2( addressdto.getAddress2() );
        address.setDistrict( addressdto.getDistrict() );
        address.setPostalCode( addressdto.getPostalCode() );
        address.setPhone( addressdto.getPhone() );
        byte[] location = addressdto.getLocation();
        if ( location != null ) {
            address.setLocation( Arrays.copyOf( location, location.length ) );
        }
        address.setLastUpdate( addressdto.getLastUpdate() );
        address.setStaffs( staffdtoSetToStaffSet( addressdto.getStaffs() ) );
        address.setCustomers( customerdtoSetToCustomerSet( addressdto.getCustomers() ) );
        address.setStores( storedtoSetToStoreSet( addressdto.getStores() ) );

        return address;
    }

    protected Staff staffdtoToStaff(Staffdto staffdto) {
        if ( staffdto == null ) {
            return null;
        }

        Staff staff = new Staff();

        staff.setStaffId( staffdto.getStaffId() );
        staff.setAddress( addressdtoToAddress( staffdto.getAddress() ) );
        staff.setStore( storedtoToStore( staffdto.getStore() ) );
        staff.setFirstName( staffdto.getFirstName() );
        staff.setLastName( staffdto.getLastName() );
        byte[] picture = staffdto.getPicture();
        if ( picture != null ) {
            staff.setPicture( Arrays.copyOf( picture, picture.length ) );
        }
        staff.setEmail( staffdto.getEmail() );
        staff.setActive( staffdto.isActive() );
        staff.setUsername( staffdto.getUsername() );
        staff.setPassword( staffdto.getPassword() );
        staff.setLastUpdate( staffdto.getLastUpdate() );
        staff.setPayments( paymentdtoSetToPaymentSet( staffdto.getPayments() ) );
        staff.setStores( storedtoSetToStoreSet( staffdto.getStores() ) );
        staff.setRentals( rentaldtoSetToRentalSet( staffdto.getRentals() ) );

        return staff;
    }
}
