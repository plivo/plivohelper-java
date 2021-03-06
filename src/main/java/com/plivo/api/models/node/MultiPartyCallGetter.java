package com.plivo.api.models.node;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.plivo.api.Plivo;
import com.plivo.api.PlivoClient;
import com.plivo.api.models.base.Getter;
import retrofit2.Call;

public class MultiPartyCallGetter extends Getter<MultiPartyCall> {

  private final String phloId;

  public MultiPartyCallGetter(String phloId, String id) {
    super(id);
    this.phloId = phloId;
  }

  @Override
  public PlivoClient client() {
    return this.plivoClient;
  }

  @JsonIgnore
  protected PlivoClient plivoClient = Plivo.getPhloClient();

  @Override
  protected Call<MultiPartyCall> obtainCall() {
    return client().getApiService()
      .multiPartyCallGet(this.phloId, NodeType.MULTI_PARTY_CALL, this.id);
  }
}
