/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fauziah
 */
@Entity
@Table(name = "category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
    , @NamedQuery(name = "Category.findByNomerKategori", query = "SELECT c FROM Category c WHERE c.nomerKategori = :nomerKategori")
    , @NamedQuery(name = "Category.findByJenis", query = "SELECT c FROM Category c WHERE c.jenis = :jenis")})
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nomer_kategori")
    private String nomerKategori;
    @Column(name = "jenis")
    private String jenis;
    @OneToMany(mappedBy = "kategoriId")
    private Collection<Buku_1> bukuCollection;

    public Category() {
    }

    public Category(String nomerKategori) {
        this.nomerKategori = nomerKategori;
    }

    public String getNomerKategori() {
        return nomerKategori;
    }

    public void setNomerKategori(String nomerKategori) {
        this.nomerKategori = nomerKategori;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @XmlTransient
    public Collection<Buku_1> getBukuCollection() {
        return bukuCollection;
    }

    public void setBukuCollection(Collection<Buku_1> bukuCollection) {
        this.bukuCollection = bukuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomerKategori != null ? nomerKategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.nomerKategori == null && other.nomerKategori != null) || (this.nomerKategori != null && !this.nomerKategori.equals(other.nomerKategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uaspbo.Category[ nomerKategori=" + nomerKategori + " ]";
    }
    
}
