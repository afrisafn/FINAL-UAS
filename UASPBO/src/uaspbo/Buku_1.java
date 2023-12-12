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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buku_1.findAll", query = "SELECT b FROM Buku_1 b")
    , @NamedQuery(name = "Buku_1.findByIsbn", query = "SELECT b FROM Buku_1 b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "Buku_1.findByJudulBuku", query = "SELECT b FROM Buku_1 b WHERE b.judulBuku = :judulBuku")
    , @NamedQuery(name = "Buku_1.findBySubJudul", query = "SELECT b FROM Buku_1 b WHERE b.subJudul = :subJudul")
    , @NamedQuery(name = "Buku_1.findByPenerbit", query = "SELECT b FROM Buku_1 b WHERE b.penerbit = :penerbit")
    , @NamedQuery(name = "Buku_1.findByPengarang", query = "SELECT b FROM Buku_1 b WHERE b.pengarang = :pengarang")
    , @NamedQuery(name = "Buku_1.findByTahunTerbit", query = "SELECT b FROM Buku_1 b WHERE b.tahunTerbit = :tahunTerbit")
    , @NamedQuery(name = "Buku_1.findByHalamanBuku", query = "SELECT b FROM Buku_1 b WHERE b.halamanBuku = :halamanBuku")})
public class Buku_1 implements Serializable {

    @OneToMany(mappedBy = "isbn")
    private Collection<Peminjaman_1> peminjamanCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "sub_judul")
    private String subJudul;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "halaman_buku")
    private String halamanBuku;
    @JoinColumn(name = "kategori_id", referencedColumnName = "nomer_kategori")
    @ManyToOne
    private Category kategoriId;

    public Buku_1() {
    }

    public Buku_1(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getSubJudul() {
        return subJudul;
    }

    public void setSubJudul(String subJudul) {
        this.subJudul = subJudul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getHalamanBuku() {
        return halamanBuku;
    }

    public void setHalamanBuku(String halamanBuku) {
        this.halamanBuku = halamanBuku;
    }

    public Category getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Category kategoriId) {
        this.kategoriId = kategoriId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buku_1)) {
            return false;
        }
        Buku_1 other = (Buku_1) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uaspbo.Buku_1[ isbn=" + isbn + " ]";
    }

    @XmlTransient
    public Collection<Peminjaman_1> getPeminjamanCollection() {
        return peminjamanCollection;
    }

    public void setPeminjamanCollection(Collection<Peminjaman_1> peminjamanCollection) {
        this.peminjamanCollection = peminjamanCollection;
    }
    
}
