package com.gameco.cakin.automotiveservices.deprecated;

import android.app.AlertDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gameco.cakin.automotiveservices.R;
import com.gameco.cakin.automotiveservices.activites.LoginActivity;
import com.gameco.cakin.automotiveservices.adapters.FriendsListAdapter;
import com.gameco.cakin.automotiveservices.datamodel.Friend;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cakin on 1/2/2018.
 */

public class myFragmentController {


//    public myFragmentController(Fragment fragment){
//        this.fragment = fragment;
//        mDatabase = FirebaseDatabase.getInstance();
//        mRef = mDatabase.getReference().child("Users");
//        notificationController = new myNotificationController(fragment);
//    }







}
//   listView.setEmptyView(popupView.findViewById(R.id.emptyElement));
//        builder.setView(mview);
//
//        dialog= builder.create();
//        dialog.show();
//            View challengesView = fragment.getActivity().getLayoutInflater().inflate(R.layout.content_my_challenges, null);
//            LinearLayout linearLayout = (LinearLayout) challengesView.findViewById(R.id.profileLinear1);
//
//            ImageView profileImage =(ImageView) linearLayout.findViewById(R.id.profPic_Can);
//
//            profileImage.setImageResource(R.drawable.ic_cagatay);
//        final AlertDialog.Builder builder = new AlertDialog.Builder(fragment.getActivity());
//         AlertDialog dialog = null;
//        layoutInflater = LayoutInflater.from(fragment.getActivity());
//        View mview = layoutInflater.inflate(R.layout.fragment_friends, null);

//        ViewGroup header_friends = (ViewGroup)layoutInflater.inflate(R.layout.header_friends_list,listView,false);
//        listView.addHeaderView(header_friends);
//        FloatingActionButton floatingActionButton = (FloatingActionButton) mview.findViewById(R.id.exitFAB);
//        final AlertDialog finalDialog = dialog;
//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
//                    @Override
//                    public void onDismiss(DialogInterface dialogInterface) {
//                        finalDialog.dismiss();
//                    }
//                });
//            }
//        });
//        FloatingActionButton closeFriendsBtn = (FloatingActionButton) mview.findViewById(R.id.closeFriendsFAB);
//        closeFriendsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
//                    @Override
//                    public void onDismiss(DialogInterface dialog) {
//                        dialog.dismiss();
//                    }
//                });
//            }
//        });



//                final View popupView = fragment.getActivity().getLayoutInflater().inflate(R.layout.popup_challenge,null);
//                final PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//                popupWindow.showAtLocation(popupView, Gravity.NO_GRAVITY,10,10);
//                Button start_challenge = (Button) popupView.findViewById(R.id.start_challenge_yourself_button);
//                start_challenge.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        myNotificationController.sendNotificationToSelf(fragment.getActivity(),"Challenge Started","Duration 7 days");
//                        //   transitionHelper.sendNotification("Challenge Started!","Duration: 7 days!");
//                        popupWindow.dismiss();
//
//                    }
//                });
//                Button send_challenge = (Button) popupView.findViewById(R.id.send_challenge_to_friend_button);
//                send_challenge.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        myNotificationController.sendNotificationToFriend("Can");
//                        //     userHelper.sendNotification();
//                    }
//                });
//                FloatingActionButton floatingActionButton = (FloatingActionButton) popupView.findViewById(R.id.exitFAB);
//                floatingActionButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        popupWindow.dismiss();
//                    }
//                });
//        FloatingActionButton exitChallengeButton = (Button) view.findViewById(R.id.exitDaily);
//        exitChallengeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
//                   @Override
//                   public void onDismiss(DialogInterface dialog) {
//                    dialog.dismiss();
//                   }
//               });
//            }
//        });
//            layoutInflater =(LayoutInflater) activity.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            //   View popupView = fragment.getActivity().getLayoutInflater().inflate(R.layout.content_daily_challenge,null);
//            View popupView = layoutInflater.inflate(R.layout.content_daily_challenge,null);
//            DrawerLayout drawerLayout = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
//            PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//            popupWindow.showAtLocation(drawerLayout, Gravity.NO_GRAVITY,10,10);



// AlertDialog.Builder builder = new AlertDialog.Builder(fragment.getActivity());

//  AlertDialog dialog = null ;

//    LayoutInflater  layoutInflater = LayoutInflater.from(fragment.getActivity());
//  View view = layoutInflater.inflate(R.layout.content_daily_challenge, null);


//        Button challengeButton = (Button) popupView.findViewById(R.id.playChallengeButton);
//        challengeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                notificationController.showPopUp();
//
//
//            }
//        });


//   builder.setView(view);

//    dialog= builder.create();
//    dialog.setCancelable(true);
//    dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
//       @Override
//       public void onCancel(DialogInterface dialog) {
//          dialog.dismiss();
//      }
//    });
//   dialog.show();
