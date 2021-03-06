package com.plivo.examples.multipartycall;

import com.plivo.api.Plivo;
import com.plivo.api.exceptions.PlivoRestException;
import com.plivo.api.exceptions.PlivoValidationException;
import com.plivo.api.models.multipartycall.MultiPartyCall;
import com.plivo.api.models.multipartycall.MultiPartyCallUtils;

import java.io.IOException;

public class Start {

  public static void main(String[] args) throws IOException, PlivoRestException, PlivoValidationException {
    Plivo.init("<YOUR-AUTH-ID>", "<YOUR-AUTH-TOKEN>");

    // You can start an initialized MPC

    // 1. either by using static starter() method of MultiPartyCall class
    MultiPartyCall.starter(MultiPartyCallUtils.friendlyName("myInitializedMPC1")).update();

    // 2. or calling object method start() of MultiPartyCall object
    MultiPartyCall.getter(MultiPartyCallUtils.friendlyName("myInitializedMPC2")).get().start();
  }
}
