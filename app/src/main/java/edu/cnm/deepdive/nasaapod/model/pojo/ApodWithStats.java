package edu.cnm.deepdive.nasaapod.model.pojo;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import edu.cnm.deepdive.nasaapod.model.entity.Apod;
import java.util.Date;

public class ApodWithStats {

  @Embedded
  private Apod apod;

  public Apod getApod() {
    return apod;
  }

  public void setApod(Apod apod) {
    this.apod = apod;
  }

  public Date getLastAccess() {
    return lastAccess;
  }

  public void setLastAccess(Date lastAccess) {
    this.lastAccess = lastAccess;
  }

  public int getAccessCount() {
    return accessCount;
  }

  public void setAccessCount(int accessCount) {
    this.accessCount = accessCount;
  }

}
