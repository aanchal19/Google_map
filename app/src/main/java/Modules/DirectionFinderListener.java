package Modules;

/**
 * Created by charul on 30/3/17.
 */
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import Modules.Route;

/**
 * Created by Mai Thanh Hiep on 4/3/2016.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}