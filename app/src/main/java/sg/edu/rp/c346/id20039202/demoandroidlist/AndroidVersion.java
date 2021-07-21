package sg.edu.rp.c346.id20039202.demoandroidlist;

import androidx.annotation.NonNull;

public class AndroidVersion {
    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @NonNull
    @Override
    public String toString() {
        return name + ": " + version;
    }
}
