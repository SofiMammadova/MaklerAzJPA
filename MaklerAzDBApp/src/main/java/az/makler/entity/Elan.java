/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Perfect
 */
@Entity
@Table(name = "elan")
@NamedQueries({
    @NamedQuery(name = "Elan.findAll", query = "SELECT e FROM Elan e"),
    @NamedQuery(name = "Elan.findByElanId", query = "SELECT e FROM Elan e WHERE e.elanId = :elanId"),
    @NamedQuery(name = "Elan.findByTip", query = "SELECT e FROM Elan e WHERE e.tip = :tip"),
    @NamedQuery(name = "Elan.findByMertebe", query = "SELECT e FROM Elan e WHERE e.mertebe = :mertebe"),
    @NamedQuery(name = "Elan.findBySahe", query = "SELECT e FROM Elan e WHERE e.sahe = :sahe"),
    @NamedQuery(name = "Elan.findByUnvan", query = "SELECT e FROM Elan e WHERE e.unvan = :unvan")})
public class Elan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "elan_id")
    private Integer elanId;
    @Column(name = "tip")
    private String tip;
    @Column(name = "mertebe")
    private Integer mertebe;
    @Column(name = "sahe")
    private Integer sahe;
    @Column(name = "unvan")
    private String unvan;
    @JoinColumn(name = "agent_id", referencedColumnName = "agent_id")
    @ManyToOne
    private Agentlik agentlik;
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne
    private Category category;

    public Elan() {
    }

    public Elan(Integer elanId) {
        this.elanId = elanId;
    }

    public Integer getElanId() {
        return elanId;
    }

    public void setElanId(Integer elanId) {
        this.elanId = elanId;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Integer getMertebe() {
        return mertebe;
    }

    public void setMertebe(Integer mertebe) {
        this.mertebe = mertebe;
    }

    public Integer getSahe() {
        return sahe;
    }

    public void setSahe(Integer sahe) {
        this.sahe = sahe;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public Agentlik getAgentlik() {
        return agentlik;
    }

    public void setAgentlik(Agentlik agentId) {
        this.agentlik = agentId;
    }

    public Category getCategoryId() {
        return category;
    }

    public void setCategoryId(Category categoryId) {
        this.category = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elanId != null ? elanId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elan)) {
            return false;
        }
        Elan other = (Elan) object;
        if ((this.elanId == null && other.elanId != null) || (this.elanId != null && !this.elanId.equals(other.elanId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Elan{" + "elanId=" + elanId + ", tip=" + tip + ", mertebe=" + mertebe + ", sahe=" + sahe + ", unvan=" + unvan + ", agentId=" + agentlik + ", categoryId=" + category + '}';
    }

  
}
