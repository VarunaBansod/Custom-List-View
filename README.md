# Custom-List-View
## > application looks like this: 
https://github.com/VarunaBansod/Custom-List-View/assets/65997106/21a63055-830e-4181-99fd-aa0e0dbff86b


Code of [MainActivity.kt](app/src/main/java/com/example/listviewprojtwo/MainActivity.kt) : it  contains list of all the items passing data to another page when item gets clicked <br>
Code of [activity_main.xml](app/src/main/res/layout/activity_main.xml) <br> this is how main page will look
Code of [My Adapter.kt](app/src/main/java/com/example/listviewprojtwo/MyAdapter.kt) : custom adapter, this will take data from MainAcivity and User.kt and will link listview with data <br>
Code of [User.kt](app/src/main/java/com/example/listviewprojtwo/User.kt): contain data of all the elements of each item <br>
Code of [UserAcitvity.kt](app/src/main/java/com/example/listviewprojtwo/UserActivity.kt) : contain code of how each item details will be shown <br>
Code of [acticity_user.xml](app/src/main/res/layout/activity_user.xml): when item gets clicked this page will be opened <br>
<br>
>Note: to add circular view add following:
### build.gradle (Module :app)
```
    app/src/main/res/layout/activity_user.xml
```

### Usage
```
    <de.hdodenhof.circleimageview.CircleImageView
            android:id="@+id/profile_image"
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:layout_margin="10dp"
            android:src="@drawable/boy1_pic0"
            app:civ_border_color="#FF000000"
            app:civ_border_width="2dp" />
```
