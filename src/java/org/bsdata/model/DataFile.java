/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bsdata.model;

import java.io.Serializable;

/**
 *
 * @author Jonskichov
 */
public class DataFile implements Serializable {
    
    private transient byte[] data;
    
    private String id;
    private int revision;
    private String authorName;
    private String authorContact;
    private String authorUrl;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorContact() {
        return authorContact;
    }

    public void setAuthorContact(String authorContact) {
        this.authorContact = authorContact;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
