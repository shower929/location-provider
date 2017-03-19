package idv.cocktail.location;

import android.location.Location;

/**
 * Created by yangzhenyu on 2017/3/19.
 */

public interface LocationCallback {
    void onLocationAvailable(Location location);
}
