/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_siswabaru;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "tb_siswa", catalog = "siswa_baru", schema = "")
@NamedQueries({
    @NamedQuery(name = "TbSiswa.findAll", query = "SELECT t FROM TbSiswa t"),
    @NamedQuery(name = "TbSiswa.findById", query = "SELECT t FROM TbSiswa t WHERE t.id = :id"),
    @NamedQuery(name = "TbSiswa.findByNama", query = "SELECT t FROM TbSiswa t WHERE t.nama = :nama"),
    @NamedQuery(name = "TbSiswa.findByJenisKelamin", query = "SELECT t FROM TbSiswa t WHERE t.jenisKelamin = :jenisKelamin"),
    @NamedQuery(name = "TbSiswa.findByKelas", query = "SELECT t FROM TbSiswa t WHERE t.kelas = :kelas"),
    @NamedQuery(name = "TbSiswa.findByJurusan", query = "SELECT t FROM TbSiswa t WHERE t.jurusan = :jurusan"),
    @NamedQuery(name = "TbSiswa.findByAlamat", query = "SELECT t FROM TbSiswa t WHERE t.alamat = :alamat")})
public class TbSiswa implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @Column(name = "kelas")
    private String kelas;
    @Basic(optional = false)
    @Column(name = "jurusan")
    private String jurusan;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;

    public TbSiswa() {
    }

    public TbSiswa(Integer id) {
        this.id = id;
    }

    public TbSiswa(Integer id, String nama, String jenisKelamin, String kelas, String jurusan, String alamat) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        String oldNama = this.nama;
        this.nama = nama;
        changeSupport.firePropertyChange("nama", oldNama, nama);
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        String oldJenisKelamin = this.jenisKelamin;
        this.jenisKelamin = jenisKelamin;
        changeSupport.firePropertyChange("jenisKelamin", oldJenisKelamin, jenisKelamin);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        String oldKelas = this.kelas;
        this.kelas = kelas;
        changeSupport.firePropertyChange("kelas", oldKelas, kelas);
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        String oldJurusan = this.jurusan;
        this.jurusan = jurusan;
        changeSupport.firePropertyChange("jurusan", oldJurusan, jurusan);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSiswa)) {
            return false;
        }
        TbSiswa other = (TbSiswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi_siswabaru.TbSiswa[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
