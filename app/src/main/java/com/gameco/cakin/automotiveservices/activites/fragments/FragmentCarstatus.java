package com.gameco.cakin.automotiveservices.activites.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gameco.cakin.automotiveservices.R;
import com.gameco.cakin.automotiveservices.backend.BackendHelper;
import com.gameco.cakin.automotiveservices.datamodel.Car;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by cakin on 11/4/2017.
 */

public class FragmentCarstatus extends Fragment {

    private Car car;

    public static FirebaseDatabase mDatabase;
    private DatabaseReference mRef;
    private FirebaseUser user;
   // private FrontController frontController;
    private TextView mileage,average_distance,remainingFuel,batteryLevel,nextService,ecoActive,fuelConsumption,vehicleName;
    private ImageView carPicture;



    private BackendHelper backendHelper;

    public FragmentCarstatus(){
        backendHelper = new BackendHelper();
    //    frontController = new FrontController(this);


    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_carstatus,container,false);
    //    getCarType();
        carPicture =(ImageView) view.findViewById(R.id.car_picture);
        vehicleName =(TextView) view.findViewById(R.id.vehicleName);
        mileage = (TextView) view.findViewById(R.id.tv_mileage);
        average_distance = (TextView) view.findViewById(R.id.tv_av_distance);
        remainingFuel = (TextView) view.findViewById(R.id.tv_fuel_state);
        batteryLevel = (TextView) view.findViewById(R.id.tv_battery_state);
        nextService = (TextView) view.findViewById(R.id.tv_next_service);
        ecoActive = (TextView) view.findViewById(R.id.tv_eco_time);
        fuelConsumption= (TextView) view.findViewById(R.id.tv_fuel_consumption);
        user = FirebaseAuth.getInstance().getCurrentUser();
        setupGUI();
//        try{
//                car =  backendHelper.tryTelematics("Telematics");
//            vehicleName.setText(car.getVIN());
//             mileage = (TextView) view.findViewById(R.id.tv_mileage);
//
//            mileage.setText(car.getMileage().replace("\"",""));
//
//             average_distance = (TextView) view.findViewById(R.id.tv_av_distance);
//
//            average_distance.setText(car.getAverage_distance_per_week().replace("\"",""));
//
//             remainingFuel = (TextView) view.findViewById(R.id.tv_fuel_state);
//
//            remainingFuel.setText(car.getRemaining_fuel().replace("\"",""));
//
//
//             batteryLevel = (TextView) view.findViewById(R.id.tv_battery_state);
//
//            batteryLevel.setText(car.getBatteryVoltage().replace("\"",""));
//
//             nextService = (TextView) view.findViewById(R.id.tv_next_service);
//
//            nextService.setText(car.getNextServiceDistance().replace("\"",""));
//
//             ecoActive = (TextView) view.findViewById(R.id.tv_eco_time);
//
//            ecoActive.setText(car.getActive_time_of_eco_mode().replace("\"",""));
//
//             fuelConsumption= (TextView) view.findViewById(R.id.tv_fuel_consumption);
//
//            fuelConsumption.setText(car.getFuel_consumption().replace("\"",""));
//
//
//            updateCarData();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return view;
    }

    private void setupGUI(){
        mDatabase =FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference();
        //    mRef.child("Users").child(LoginActivity.user_full_name).addListenerForSingleValueEvent(new ValueEventListener() {
        mRef.child("Users").child(user.getEmail().replace(".",",")).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                mileage.setText((String)dataSnapshot.child("Car").child("Mileage").getValue());
                average_distance.setText((String) dataSnapshot.child("Car").child("Average distance").getValue());
                remainingFuel.setText((String)dataSnapshot.child("Car").child("Remaining Fuel").getValue());
                batteryLevel.setText((String)dataSnapshot.child("Car").child("Battery Level").getValue());
                nextService.setText((String)dataSnapshot.child("Car").child("Next Service").getValue());
                fuelConsumption.setText((String)dataSnapshot.child("Car").child("Fuel Consumption").getValue());
                vehicleName.setText((String)dataSnapshot.child("Car").child("vin").getValue());


//                dataSnapshot.getRef().child("Car").child("Average distance").setValue(average_distance.getText().toString());
//                dataSnapshot.getRef().child("Car").child("Remaining Fuel").setValue(remainingFuel.getText().toString());
//                dataSnapshot.getRef().child("Car").child("Next Service").setValue(nextService.getText().toString());
//                dataSnapshot.getRef().child("Car").child("Fuel Consumption").setValue(fuelConsumption.getText().toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }



    private void updateCarData(){
        mDatabase =FirebaseDatabase.getInstance();
         mRef = mDatabase.getReference();
     //    mRef.child("Users").child(LoginActivity.user_full_name).addListenerForSingleValueEvent(new ValueEventListener() {
        mRef.child("Users").child(user.getEmail().replace(".",",")).addListenerForSingleValueEvent(new ValueEventListener() {
             @Override
             public void onDataChange(DataSnapshot dataSnapshot) {
                 dataSnapshot.getRef().child("Car").child("Mileage").setValue(mileage.getText().toString());
                 dataSnapshot.getRef().child("Car").child("Average distance").setValue(average_distance.getText().toString());
                 dataSnapshot.getRef().child("Car").child("Remaining Fuel").setValue(remainingFuel.getText().toString());
                 dataSnapshot.getRef().child("Car").child("Next Service").setValue(nextService.getText().toString());
                 dataSnapshot.getRef().child("Car").child("Fuel Consumption").setValue(fuelConsumption.getText().toString());
             }

             @Override
             public void onCancelled(DatabaseError databaseError) {

             }
         });

    }
    private void setVehicleInfo(String carType){

        switch (carType) {
            case "BMW i3":
                carPicture.setImageDrawable(this.getActivity().getResources().getDrawable(R.drawable.i3_picture));
                break;
            case "BMW 120d":
                carPicture.setImageDrawable(this.getActivity().getResources().getDrawable(R.drawable.bmw120d));
                break;
            case "BMW 140i":
                carPicture.setImageDrawable(this.getActivity().getResources().getDrawable(R.drawable.bmw140i));
                break;
            case "BMW M235i":
                carPicture.setImageDrawable(this.getActivity().getResources().getDrawable(R.drawable.bmwm235i));
                break;
        }
    }
    private void getCarType(){

        mDatabase =FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference();
        user = FirebaseAuth.getInstance().getCurrentUser();

     //   mRef.child("Users").child(LoginActivity.user_full_name).child("Car").addListenerForSingleValueEvent(new ValueEventListener() {
        mRef.child("Users").child(user.getEmail().replace(".",",")).child("Car").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String type  = (String) dataSnapshot.child("carName").getValue();
                setVehicleInfo(type);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

}
