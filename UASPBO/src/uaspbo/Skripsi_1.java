/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fauziah
 */
@Entity
@Table(name = "skripsi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skripsi_1.findAll", query = "SELECT s FROM Skripsi_1 s")
    , @NamedQuery(name = "Skripsi_1.findByIdSkripsi", query = "SELECT s FROM Skripsi_1 s WHERE s.idSkripsi = :idSkripsi")
    , @NamedQuery(name = "Skripsi_1.findByJudulSkripsi", query = "SELECT s FROM Skripsi_1 s WHERE s.judulSkripsi = :judulSkripsi")
    , @NamedQuery(name = "Skripsi_1.findByPenulisSkripsi", query = "SELECT s FROM Skripsi_1 s WHERE s.penulisSkripsi = :penulisSkripsi")
    , @NamedQuery(name = "Skripsi_1.findByHalamanSkripsi", query = "SELECT s FROM Skripsi_1 s WHERE s.halamanSkripsi = :halamanSkripsi")
    , @NamedQuery(name = "Skripsi_1.findByTahunSkripsi", query = "SELECT s FROM Skripsi_1 s WHERE s.tahunSkripsi = :tahunSkripsi")})
public class Skripsi_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;
    @Column(name = "judul_skripsi")
    private String judulSkripsi;
    @Column(name = "penulis_skripsi")
    private String penulisSkripsi;
    @Column(name = "halaman_skripsi")
    private String halamanSkripsi;
    @Column(name = "tahun_skripsi")
    private String tahunSkripsi;

    public Skripsi_1() {
    }

    public Skripsi_1(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    public String getPenulisSkripsi() {
        return penulisSkripsi;
    }

    public void setPenulisSkripsi(String penulisSkripsi) {
        this.penulisSkripsi = penulisSkripsi;
    }

    public String getHalamanSkripsi() {
        return halamanSkripsi;
    }

    public void setHalamanSkripsi(String halamanSkripsi) {
        this.halamanSkripsi = halamanSkripsi;
    }

    public String getTahunSkripsi() {
        return tahunSkripsi;
    }

    public void setTahunSkripsi(String tahunSkripsi) {
        this.tahunSkripsi = tahunSkripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skripsi_1)) {
            return false;
        }
        Skripsi_1 other = (Skripsi_1) object;
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uaspbo.Skripsi_1[ idSkripsi=" + idSkripsi + " ]";
    }
    
}
