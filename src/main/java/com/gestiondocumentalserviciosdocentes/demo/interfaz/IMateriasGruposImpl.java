package com.gestiondocumentalserviciosdocentes.demo.interfaz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestiondocumentalserviciosdocentes.demo.Conexion;
import com.gestiondocumentalserviciosdocentes.demo.genericos.BaseConecctionFactory;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocentesPeriodoMenu;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosCapacitacionesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.DocumentosGruposDocente;
import com.gestiondocumentalserviciosdocentes.demo.modelo.MateriasGrupos;
import com.gestiondocumentalserviciosdocentes.demo.modelo.Notificaciones;
import com.gestiondocumentalserviciosdocentes.demo.modelo.ParticipantesDocentes;
import com.gestiondocumentalserviciosdocentes.demo.modelo.SeleccionActividadesDocente;

public class IMateriasGruposImpl extends BaseConecctionFactory implements IMateriasGrupos{

	@Override
	public List<MateriasGrupos> buscarmateriasgrupos(int id_usuarios) {
		List<MateriasGrupos> respuesta;
		MateriasGrupos item;
		 try {
			 String sql ="select g.id_Grupo, m.mat_clave, m.mat_nombre, g.GRP_Grupo \n"
			 		+ "from materias m join grupos_docentes g on g.id_materia = m.id_materia \n"
			 		+ "where g.id_DocPer = "+ id_usuarios;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 int x = 1;
			 while (rset.next()) {
				item=new MateriasGrupos();
				item.setRowmg(x);
				item.setClave(rset.getString("mat_clave"));
				item.setNombre(rset.getString("mat_nombre"));
				item.setGrupo(rset.getString("grp_grupo"));
				item.setId_grupo(rset.getInt("id_Grupo"));
				
				respuesta.add(item);
				x ++;
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<DocumentosGruposDocente> buscarDocumentosGruposDocentes(int id_grupo, int id_departamento) {
		List<DocumentosGruposDocente> respuesta;
		DocumentosGruposDocente item;
		 try {
			 String sql ="select dg.id_DocumentoGrupo, dg.id_Grupo, f.id_Formato, dg.DOCGRP_pdf_Documento, dg.DOCGRP_Comentario, ifnull(dg.DOCGRP_EstadoComentario, 0) DOCGRP_EstadoComentario, f.FRM_Nombre \n"
			 		+ "from( select id_DocumentoGrupo, id_Grupo, id_Formato, DOCGRP_pdf_Documento, DOCGRP_Comentario, DOCGRP_EstadoComentario from documentos_grupos where id_Grupo = "+ id_grupo +") dg \n"
			 		+ "right join formatos f on f.id_Formato = dg.id_Formato where f.FMR_Tipo = 'Academico' and f.id_Departamento = " + id_departamento;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 int x = 1;
			 while (rset.next()) {
				item=new DocumentosGruposDocente();
				item.setRowdgc(x);
				item.setId_documentogrupo(rset.getInt("id_DocumentoGrupo"));
				item.setId_grupo(rset.getInt("id_Grupo"));
				item.setId_formato(rset.getInt("id_Formato"));
				item.setDocgrp_pdf_documento(rset.getString("DOCGRP_pdf_Documento"));
				item.setDocgrp_comentario(rset.getString("DOCGRP_Comentario"));
				item.setDocgrp_estadocomentario(rset.getInt("DOCGRP_EstadoComentario"));
				item.setFrm_nombre(rset.getString("FRM_Nombre"));
				
				respuesta.add(item);
				x ++;
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<SeleccionActividadesDocente> buscarselecionactividades(int id_usuarios, int id_docper) {
		List<SeleccionActividadesDocente> respuesta;
		SeleccionActividadesDocente item;
		 try {
			 String sql ="select aad.id_ActividadDocentePeriodo, aad.id_DocPer, aad.id_Actividades_Docencia, aad.ACTDOC_pdf_Actividad, aad.ACTDOC_Comentario, ifnull(aad.ACTDOC_EstadoComentario, 0) ACTDOC_EstadoComentario, ap.ACTDOC_Nombre_Actividad \n"
			 		+ "from seleccion_apoyodocencia aad \n"
			 		+ "join act_apoyo_docencia ap on aad.id_Actividades_Docencia = ap.id_Actividades_Docencia \n"
			 		+ "where aad.id_DocPer = "+ id_docper;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new SeleccionActividadesDocente();
				item.setId_actividaddocenteperiodo(rset.getInt("id_ActividadDocentePeriodo"));
				item.setId_docper(rset.getInt("id_DocPer"));
				item.setId_actividades_docencia(rset.getInt("id_Actividades_Docencia"));
				item.setActdoc_pdf_actividad(rset.getString("ACTDOC_pdf_Actividad"));
				item.setActdoc_comentario(rset.getString("ACTDOC_Comentario"));
				item.setActdoc_estadocomentario(rset.getInt("ACTDOC_EstadoComentario"));
				item.setActdoc_nombre_actividad(rset.getString("ACTDOC_Nombre_Actividad"));
				
				respuesta.add(item);
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public DocentesPeriodoMenu buscardocentesperiodos(int id_usuarios, int id_periodo) {
		DocentesPeriodoMenu item = new DocentesPeriodoMenu();
		 try {
			 String sql ="select dp.id_DocPer, dp.id_Usuarios, dp.id_Periodo, dp.DOCPER_pdf_Horario, dp.DOCPER_pdf_LiberacionAct, dp.DOCPER_pdf_ReporteFinal, dp.DOCPER_Retroalimentacion_reportefinal, ifnull(dp.DOCPER_Estado_reportefinal, 0) DOCPER_Estado_reportefinal \n"
			 		+ "from docentes_periodo dp \n"
			 		+ "where dp.id_Periodo = " + id_periodo + " and dp.id_usuarios = "+id_usuarios;
			 System.out.println(sql);
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 if (rset.next()) {
				
				item.setId_docper(rset.getInt("id_DocPer"));
				item.setId_usuarios(rset.getInt("id_Usuarios"));
				item.setId_periodo(rset.getInt("id_Periodo"));
				item.setDocper_pdf_horario(rset.getString("DOCPER_pdf_Horario"));
				item.setDocper_pdf_liberacionact(rset.getString("DOCPER_pdf_LiberacionAct"));
				item.setDocper_pdf_reportefinal(rset.getString("DOCPER_pdf_ReporteFinal"));
				item.setDocper_retroalimentacion_reportefinal(rset.getString("DOCPER_Retroalimentacion_reportefinal"));
				item.setDocper_estado_reportefinal(rset.getInt("DOCPER_Estado_reportefinal"));
				
			}
			 return item;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<MateriasGrupos> buscargrupossecretaria(int id_docper) {
		List<MateriasGrupos> respuesta;
		MateriasGrupos item;
		 try {
			 String sql ="select g.id_Grupo, m.mat_clave, m.mat_nombre, g.GRP_Grupo \n"
			 		+ "from materias m join grupos_docentes g on g.id_materia = m.id_materia \n"
			 		+ "where g.id_DocPer = "+ id_docper;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 int x = 1;
			 while (rset.next()) {
				item=new MateriasGrupos();
				item.setRowmg(x);
				item.setClave(rset.getString("mat_clave"));
				item.setNombre(rset.getString("mat_nombre"));
				item.setGrupo(rset.getString("grp_grupo"));
				item.setId_grupo(rset.getInt("id_Grupo"));
				
				respuesta.add(item);
				x ++;
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<ParticipantesDocentes> participaciones(int id_usuarios, int id_periodo) {
		List<ParticipantesDocentes> respuesta;
		ParticipantesDocentes item;
		 try {
			 String sql ="select p.id_Participante, p.id_Capacitacion, p.id_Usuarios, p.PART_pdf_Encuesta, p.PART_pdf_Constancia, c.CAP_Nombre_Cap, c.CAP_Fecha_Impartir \n"
			 		+ "from participantes p join capacitaciones c on p.id_Capacitacion = c.id_Capacitacion\n"
			 		+ "join departamento_desarrollo_academico dda on dda.id_Dep_Desa = c.id_Dep_Desa\n"
			 		+ "join desarrollo_academico_institucional dai on dai.id_Desarrollo_Academico = dda.id_Desarrollo_Academico \n"
			 		+ "where id_Usuarios = " + id_usuarios + " and dai.id_periodo = " + id_periodo;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 int x = 1;
			 while (rset.next()) {
				item=new ParticipantesDocentes();
				item.setRow(x);
				item.setId_participante(rset.getInt("id_Participante"));
				item.setId_capacitacion(rset.getInt("id_Capacitacion"));
				item.setId_Usuarios(rset.getInt("id_Usuarios"));
				item.setPart_pdf_constancia(rset.getString("PART_pdf_Constancia"));
				item.setPart_pdf_encuesta(rset.getString("PART_pdf_Encuesta"));
				item.setNombre(rset.getString("CAP_Nombre_Cap"));
				item.setFecha(rset.getString("CAP_Fecha_Impartir"));
				respuesta.add(item);
				x ++;
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<Notificaciones> notificaciones(int id_usuarios) {
		List<Notificaciones> respuesta;
		Notificaciones item;
		 try {
			 String sql ="select * from (\r\n"
			 		+ "select 'Reporte Final' nombre, 'Reporte Final' procedencia, ifnull(DOCPER_Estado_reportefinal, 0) estado, notify, id_usuarios, id_periodo, concat('menudocencia/',id_periodo) ir, id_DocPer, id_DocPer id\r\n"
			 		+ "from docentes_periodo\r\n"
			 		+ "union all\r\n"
			 		+ "select f.FRM_Nombre nombre, concat(m.MAT_Nombre,' Grupo ', GRP_Grupo) procedencia, dg.DOCGRP_EstadoComentario estado, dg.notify, dp.id_usuarios, dp.id_periodo, concat('documentosgrupos/',dg.id_Grupo) ir, dp.id_DocPer, dg.id_DocumentoGrupo id\r\n"
			 		+ "from documentos_grupos dg \r\n"
			 		+ "join formatos f on f.id_Formato = dg.id_Formato\r\n"
			 		+ "join grupos_docentes gd on gd.id_Grupo = dg.id_Grupo\r\n"
			 		+ "join materias m on m.id_materia = gd.id_materia\r\n"
			 		+ "join docentes_periodo dp on dp.id_docper = gd.id_docper\r\n"
			 		+ "#where dg.DOCGRP_Comentario != null or dg.DOCGRP_EstadoComentario in (1,2)\r\n"
			 		+ "union all\r\n"
			 		+ "select ap.ACTDOC_Nombre_Actividad nombre, 'Actividad en Apoyo a la Docencia' procedencia, ifnull(aad.ACTDOC_EstadoComentario, 0) estado, aad.notify, dp.id_usuarios, dp.id_periodo, concat('actividadesapoyo/',aad.id_DocPer) ir, dp.id_DocPer, aad.id_ActividadDocentePeriodo id\r\n"
			 		+ "from seleccion_apoyodocencia aad \r\n"
			 		+ "join act_apoyo_docencia ap on aad.id_Actividades_Docencia = ap.id_Actividades_Docencia\r\n"
			 		+ "join docentes_periodo dp on aad.id_DocPer = dp.id_DocPer\r\n"
			 		+ "union all\r\n"
			 		+ "select PRODESTEC_Nombre_Producto nombre, 'Productos Desarrollo Tecnológico' procedencia, ifnull(PRODESTEC_Retroalimentacion, 0) estado, pdt.notify, dp.id_usuarios, dp.id_periodo, concat('productosdesarrollo/',dp.id_DocPer) ir, dp.id_DocPer, pdt.id_Productos_Desa_Tec id\r\n"
			 		+ "from productos_des_tecnologico pdt\r\n"
			 		+ "join docentes_periodo dp on pdt.id_DocPer = dp.id_DocPer\r\n"
			 		+ "union all\r\n"
			 		+ "select PRODOC_Nombre_Producto nombre, 'Productos Docencia' procedencia, ifnull(PRODOC_Retroalimentacion, 0) estado, pd.notify, dp.id_usuarios, dp.id_periodo, concat('productosdocencia/',dp.id_DocPer) ir, dp.id_DocPer, pd.id_Productos_Docencia id\r\n"
			 		+ "from productos_docencia pd\r\n"
			 		+ "join docentes_periodo dp on pd.id_DocPer = dp.id_DocPer ) notificaciones where notify = 1 and id_usuarios = " + id_usuarios;
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 int x = 1;
			 while (rset.next()) {
				item=new Notificaciones();
				item.setRow(x);
				item.setEstado(rset.getInt("estado"));
				item.setId_periodo(rset.getInt("id_periodo"));
				item.setId_usuarios(rset.getInt("id_usuarios"));
				item.setProcedencia(rset.getString("procedencia"));
				item.setIr(rset.getString("ir"));
				item.setNombre(rset.getString("nombre"));
				item.setNotify(rset.getInt("notify"));
				item.setId(rset.getInt("id"));
				item.setId_DocPer(rset.getInt("id_DocPer"));
				respuesta.add(item);
				x ++;
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

	@Override
	public List<DocumentosCapacitacionesDocentes> documentos(int id_capacitacion) {
		List<DocumentosCapacitacionesDocentes> respuesta;
		DocumentosCapacitacionesDocentes item;
		 try {
			 String sql ="select dc.id_Doc_Capacitaciones, dc.id_Capacitacion, f.id_Formato, dc.DOCCAP_pdf_Documento, f.FRM_Nombre formato\r\n"
			 		+ "from( select * from documentos_capacitaciones where id_Capacitacion = "+ id_capacitacion +") dc \r\n"
			 		+ "right join formatos f on f.id_Formato = dc.id_Formato where f.FMR_Tipo = 'Capacitaciones' ";
			 System.out.println(sql);
			 respuesta=new ArrayList<>();
			 
			 con = Conexion.getConexion();
			 stmt=con.createStatement();
			 rset=stmt.executeQuery(sql);
			 
			 while (rset.next()) {
				item=new DocumentosCapacitacionesDocentes();
				item.setId_doc_capacitaciones(rset.getInt("id_doc_capacitaciones"));
				item.setId_capacitacion(rset.getInt("id_capacitacion"));
				item.setId_Formato(rset.getInt("id_Formato"));
				item.setDoccap_pdf_documento(rset.getString("doccap_pdf_documento"));
				item.setFormato(rset.getString("formato"));
				
				respuesta.add(item);
			}
			 return respuesta;
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				con.close();
			} catch ( SQLException e) {
				e.printStackTrace(); 
			}
		}
		return null;
	}

}
