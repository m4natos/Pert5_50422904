/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert5_50422904.repository;

import com.mycompany.pert5_50422904.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository; // Perlu untuk JpaRepository
import org.springframework.stereotype.Repository; // Perlu untuk @Repository

/**
 *
 * @author aikou
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {

}