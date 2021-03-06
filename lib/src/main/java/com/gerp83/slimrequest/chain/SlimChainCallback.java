package com.gerp83.slimrequest.chain;

import com.gerp83.slimrequest.model.SlimResult;

import java.util.ArrayList;

/**
 * callBack for SlimChain
 */
public interface SlimChainCallback {

    void onResult(ArrayList<SlimResult> results);

}