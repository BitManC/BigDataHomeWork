// File generated by hadoop record compiler. Do not edit.
/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.zookeeper.proto;

import org.apache.jute.*;
import org.apache.yetus.audience.InterfaceAudience;
@InterfaceAudience.Public
public class ReconfigRequest implements Record {
  private String joiningServers;
  private String leavingServers;
  private String newMembers;
  private long curConfigId;
  public ReconfigRequest() {
  }
  public ReconfigRequest(
        String joiningServers,
        String leavingServers,
        String newMembers,
        long curConfigId) {
    this.joiningServers=joiningServers;
    this.leavingServers=leavingServers;
    this.newMembers=newMembers;
    this.curConfigId=curConfigId;
  }
  public String getJoiningServers() {
    return joiningServers;
  }
  public void setJoiningServers(String m_) {
    joiningServers=m_;
  }
  public String getLeavingServers() {
    return leavingServers;
  }
  public void setLeavingServers(String m_) {
    leavingServers=m_;
  }
  public String getNewMembers() {
    return newMembers;
  }
  public void setNewMembers(String m_) {
    newMembers=m_;
  }
  public long getCurConfigId() {
    return curConfigId;
  }
  public void setCurConfigId(long m_) {
    curConfigId=m_;
  }
  public void serialize(OutputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(this,tag);
    a_.writeString(joiningServers,"joiningServers");
    a_.writeString(leavingServers,"leavingServers");
    a_.writeString(newMembers,"newMembers");
    a_.writeLong(curConfigId,"curConfigId");
    a_.endRecord(this,tag);
  }
  public void deserialize(InputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(tag);
    joiningServers=a_.readString("joiningServers");
    leavingServers=a_.readString("leavingServers");
    newMembers=a_.readString("newMembers");
    curConfigId=a_.readLong("curConfigId");
    a_.endRecord(tag);
}
  public String toString() {
    try {
      java.io.ByteArrayOutputStream s =
        new java.io.ByteArrayOutputStream();
      CsvOutputArchive a_ = 
        new CsvOutputArchive(s);
      a_.startRecord(this,"");
    a_.writeString(joiningServers,"joiningServers");
    a_.writeString(leavingServers,"leavingServers");
    a_.writeString(newMembers,"newMembers");
    a_.writeLong(curConfigId,"curConfigId");
      a_.endRecord(this,"");
      return new String(s.toByteArray(), "UTF-8");
    } catch (Throwable ex) {
      ex.printStackTrace();
    }
    return "ERROR";
  }
  public void write(java.io.DataOutput out) throws java.io.IOException {
    BinaryOutputArchive archive = new BinaryOutputArchive(out);
    serialize(archive, "");
  }
  public void readFields(java.io.DataInput in) throws java.io.IOException {
    BinaryInputArchive archive = new BinaryInputArchive(in);
    deserialize(archive, "");
  }
  public int compareTo (Object peer_) throws ClassCastException {
    if (!(peer_ instanceof ReconfigRequest)) {
      throw new ClassCastException("Comparing different types of records.");
    }
    ReconfigRequest peer = (ReconfigRequest) peer_;
    int ret = 0;
    ret = joiningServers.compareTo(peer.joiningServers);
    if (ret != 0) return ret;
    ret = leavingServers.compareTo(peer.leavingServers);
    if (ret != 0) return ret;
    ret = newMembers.compareTo(peer.newMembers);
    if (ret != 0) return ret;
    ret = (curConfigId == peer.curConfigId)? 0 :((curConfigId<peer.curConfigId)?-1:1);
    if (ret != 0) return ret;
     return ret;
  }
  public boolean equals(Object peer_) {
    if (!(peer_ instanceof ReconfigRequest)) {
      return false;
    }
    if (peer_ == this) {
      return true;
    }
    ReconfigRequest peer = (ReconfigRequest) peer_;
    boolean ret = false;
    ret = joiningServers.equals(peer.joiningServers);
    if (!ret) return ret;
    ret = leavingServers.equals(peer.leavingServers);
    if (!ret) return ret;
    ret = newMembers.equals(peer.newMembers);
    if (!ret) return ret;
    ret = (curConfigId==peer.curConfigId);
    if (!ret) return ret;
     return ret;
  }
  public int hashCode() {
    int result = 17;
    int ret;
    ret = joiningServers.hashCode();
    result = 37*result + ret;
    ret = leavingServers.hashCode();
    result = 37*result + ret;
    ret = newMembers.hashCode();
    result = 37*result + ret;
    ret = (int) (curConfigId^(curConfigId>>>32));
    result = 37*result + ret;
    return result;
  }
  public static String signature() {
    return "LReconfigRequest(sssl)";
  }
}
