package cn.edu.cdut.lm.mymuiscplayer.module;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LimiaoMaster on 2016/9/3 16:16
 */

public class FolderInfo implements Parcelable {
    private String folderName;
    private String folderPath;
    private int numberOfTracks;

    public FolderInfo() {
    }

    protected FolderInfo(Parcel in) {
        folderName = in.readString();
        folderPath = in.readString();
        numberOfTracks = in.readInt();
    }

    public static final Creator<FolderInfo> CREATOR = new Creator<FolderInfo>() {
        @Override
        public FolderInfo createFromParcel(Parcel in) {
            return new FolderInfo(in);
        }

        @Override
        public FolderInfo[] newArray(int size) {
            return new FolderInfo[size];
        }
    };

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(folderName);
        dest.writeString(folderPath);
        dest.writeInt(numberOfTracks);
    }
}
