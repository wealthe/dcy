package com.example.dcy.domain.entity;

/**
 * T_CORP与T_M_CORP_CORP_PERTAINST关联表
 */
public class TMCorpCorpPertains {

  private String id;
  private String seqId;
  private String org;
  private String subId;
  private String subSeqId;
  private String subOrg;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSeqId() {
    return seqId;
  }

  public void setSeqId(String seqId) {
    this.seqId = seqId;
  }


  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }


  public String getSubId() {
    return subId;
  }

  public void setSubId(String subId) {
    this.subId = subId;
  }


  public String getSubSeqId() {
    return subSeqId;
  }

  public void setSubSeqId(String subSeqId) {
    this.subSeqId = subSeqId;
  }


  public String getSubOrg() {
    return subOrg;
  }

  public void setSubOrg(String subOrg) {
    this.subOrg = subOrg;
  }

}
