/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bd.manager;

import com.bd.connection.SFConnector;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.ws.ConnectionException;

/**
 *
 * @author Siddhrajsinh_Atodari
 */
public class SFManager {

    public static int getRecordSize() throws ConnectionException {

        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT Id FROM Account Limit 10");
        QueryResult queryResults = SFConnector.sfdcConncetion().query(queryString.toString());
        return queryResults.getSize();
    }

}
