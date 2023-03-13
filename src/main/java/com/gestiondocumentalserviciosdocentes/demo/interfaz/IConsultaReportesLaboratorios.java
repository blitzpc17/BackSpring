package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.clsReportesLaboratorios;

public class IConsultaReportesLaboratorios extends BaseConecctionFactory implements IConsultaReportesLaboratorio {

	@Override
	public List<clsReportesLaboratorios> ListarReportesLaboratoriosDepto(int deptoId) {
		try {
			String sql="select \r\n"
					+ "d.id_DocumentoLaboratorio as IdArchivo,\r\n"
					+ "d.doclab_pdf as RutaArchivo,\r\n"
					+ "f.FRM_Nombre as NombreFormato,\r\n"
					+ "f.FMR_Tipo  as TipoFormato,\r\n"
					+ "l.LAB_Nombre as NombreLaboratorio,\r\n"
					+ "dep.DEP_nombre as NombreDepartamento,\r\n"
					+ "p.PER_Mes_Inicio as MesInicial,\r\n"
					+ "p.PER_Mes_Fin  as MesFinal,\r\n"
					+ "p.PER_Year as Anio,\r\n"
					+ "u.USER_Nombre as Encargado,\r\n"
					+ "dep.id_Departamento as DepartamentoId\r\n"
					+ "from documentoslaboratorios d \r\n"
					+ "join formatos f on d.id_formato = f.id_Formato \r\n"
					+ "join gestionlaboratorio g on d.id_gestionlaboratorio = g.id_GestionLaboratorio \r\n"
					+ "join departamento dep on f.id_Departamento  = dep.id_Departamento \r\n"
					+ "join laboratorios l on g.id_Laboratorio = l.id_Laboratorio \r\n"
					+ "join periodos p on g.id_Periodo  = p.id_Periodo \r\n"
					+ "join usuarios u on l.id_Usuarios = u.id_Usuarios \r\n"
					+ "where dep.id_Departamento = "+deptoId ;
			
			con=Conexion.getConexion();
			stmt=con.createStatement();
			rset=stmt.executeQuery(sql);
			
			List<clsReportesLaboratorios> respuesta = new ArrayList<clsReportesLaboratorios>();
			
			while(rset.next()) {
				clsReportesLaboratorios item=new clsReportesLaboratorios();
				
				item.setIdArchivo(rset.getInt("IdArchivo"));
				item.setRutaArchivo(rset.getString("RutaArchivo"));
				item.setNombreFormato(rset.getString("NombreFormato"));
				item.setTipoFormato(rset.getString("TipoFormato"));
				item.setNombreLaboratorio(rset.getString("NombreLaboratorio"));
				item.setNombreDepartamento(rset.getString("NombreDepartamento"));
				item.setMesInicial(rset.getInt("MesInicial"));
				item.setMesFinal(rset.getInt("MesFinal"));				
				item.setAnio(rset.getInt("Anio"));
				item.setEncargado(rset.getString("Encargado"));
				item.setDepartamentoId(rset.getInt("DepartamentoId"));
				
				respuesta.add(item);
			}
			
			System.out.println(sql);
			
			return respuesta;
	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				rset.close();
				stmt.close();
				con.close();
				
			} catch (Exception e2) {

				e2.printStackTrace();
				
			}
		}
	
		return null;
	}
	
	
	

}
