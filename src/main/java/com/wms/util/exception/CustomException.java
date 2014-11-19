/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.util.exception;

/**
 *
 * @author cgx1844568
 * @date 2014-11-19
 * @time 9:00:03
 *
 */
public class CustomException extends Exception{
/**
     * 序列化ID
     */
    private static final long serialVersionUID = 1L;

    public CustomException() {
        super();
    }
    
    public CustomException(String msg) {
        super(msg);
    }
    
    public CustomException(String msg, Throwable cause) {
        super(msg, cause);
    }
    
    public CustomException(Throwable cause) {
        super(cause);
    }

}
