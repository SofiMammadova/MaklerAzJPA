/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.makler.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Perfect
 */
@Entity
@Table(name = "agentlik")
@NamedQueries({
    @NamedQuery(name = "Agentlik.findAll", query = "SELECT a FROM Agentlik a"),
    @NamedQuery(name = "Agentlik.findByAgentId", query = "SELECT a FROM Agentlik a WHERE a.agentId = :agentId"),
    @NamedQuery(name = "Agentlik.findByAgentName", query = "SELECT a FROM Agentlik a WHERE a.agentName = :agentName"),
    @NamedQuery(name = "Agentlik.findByContact", query = "SELECT a FROM Agentlik a WHERE a.contact = :contact")})
public class Agentlik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "agent_id")
    private Integer agentId;
    @Column(name = "agent_name")
    private String agentName;
    @Column(name = "contact")
    private String contact;
    @OneToMany(mappedBy = "agentlik")
    private List<Elan> elanList;

    public Agentlik() {
    }

    public Agentlik(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Elan> getElanList() {
        return elanList;
    }

    public void setElanList(List<Elan> elanList) {
        this.elanList = elanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agentId != null ? agentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agentlik)) {
            return false;
        }
        Agentlik other = (Agentlik) object;
        if ((this.agentId == null && other.agentId != null) || (this.agentId != null && !this.agentId.equals(other.agentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agentlik{" + "agentId=" + agentId + ", agentName=" + agentName + ", contact=" + contact + '}';
    }

  
}
