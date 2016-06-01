package jee05.generadores.clases.RespuestaPDF;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import jee05.tablasenbasedadatos.TablaPrueba;
import jee05.tablasenbasedadatos.TuplaTablaPrueba;
import jee05.utilidades.Log;

@WebServlet({ "/servlets/clases/RespuestaPDF/generar" })
public class Generar extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
          throws ServletException, IOException {

    Log.println("/servlets/clases/RespuestaPDF/generar.doGet()", "Atendiendo solicitud de impresión...");
    
    TablaPrueba tablaPrueba = (TablaPrueba)request.getAttribute("tablaPrueba");
    
    Document documentoPDF = new Document();
    ByteArrayOutputStream flujoDeBytes = new ByteArrayOutputStream();
    PdfWriter impresionEnPDF = null;
    
    try {
      impresionEnPDF = PdfWriter.getInstance(documentoPDF, flujoDeBytes);
      impresionEnPDF.setPdfVersion(PdfWriter.PDF_VERSION_1_7);
      documentoPDF.open();
      documentoPDF.newPage();
      
      Font fuente = new Font(Font.FontFamily.TIMES_ROMAN, 6, Font.NORMAL | Font.UNDERLINE);
            
      PdfPTable tabla = new PdfPTable(8);
      
      PdfPCell th1 = new PdfPCell(new Paragraph("#", fuente));
      PdfPCell th2 = new PdfPCell(new Paragraph("id", fuente));
      PdfPCell th3 = new PdfPCell(new Paragraph("a", fuente));
      PdfPCell th4 = new PdfPCell(new Paragraph("b", fuente));
      PdfPCell th5 = new PdfPCell(new Paragraph("c", fuente));
      PdfPCell th6 = new PdfPCell(new Paragraph("d", fuente));
      PdfPCell th7 = new PdfPCell(new Paragraph("e", fuente));
      PdfPCell th8 = new PdfPCell(new Paragraph("f", fuente));
      
      tabla.addCell(th1);
      tabla.addCell(th2);
      tabla.addCell(th3);
      tabla.addCell(th4);
      tabla.addCell(th5);
      tabla.addCell(th6);
      tabla.addCell(th7);
      tabla.addCell(th8);
      
      for (int i = 0; i < tablaPrueba.obtenerCantidadDetuplas(); i++) {
        TuplaTablaPrueba tupla = tablaPrueba.obtenerTuplaEnIndice(i);
        PdfPCell td1 = new PdfPCell(new Paragraph(String.valueOf(i + 1), fuente));
        PdfPCell td2 = new PdfPCell(new Paragraph(String.valueOf(tupla.getId()), fuente));
        PdfPCell td3 = new PdfPCell(new Paragraph(tupla.getA(), fuente));
        PdfPCell td4 = new PdfPCell(new Paragraph(tupla.getB(), fuente));
        PdfPCell td5 = new PdfPCell(new Paragraph(tupla.getC(), fuente));
        PdfPCell td6 = new PdfPCell(new Paragraph(String.valueOf(tupla.getD()), fuente));
        PdfPCell td7 = new PdfPCell(new Paragraph(String.valueOf(tupla.isE()), fuente));
        PdfPCell td8 = new PdfPCell(new Paragraph(String.valueOf(tupla.getF()), fuente));
        
        tabla.addCell(td1);
        tabla.addCell(td2);
        tabla.addCell(td3);
        tabla.addCell(td4);
        tabla.addCell(td5);
        tabla.addCell(td6);
        tabla.addCell(td7);
        tabla.addCell(td8);
      }
      
      documentoPDF.add(tabla);
      
      documentoPDF.close();
      impresionEnPDF.close();
    } catch (DocumentException e) {
      Log.println("Generar.doGet()", "\tError, el documento PDF no pudo ser generado.");
      Log.println("Generar.doGet()","\t" + e.getMessage());
      Log.println("Generar.doGet()","\t" + e.getCause());
    }
    
    response.setContentType("application/pdf");
    response.setHeader("Content-Disposition", "inline; filename=" + "ImpresionEnFormatoPDF.pdf");
    response.setContentLength(flujoDeBytes.size());
    
    ServletOutputStream flujoDeSalida = response.getOutputStream();
    flujoDeBytes.writeTo(flujoDeSalida);
    flujoDeSalida.flush();
    
    Log.println("/servlets/clases/RespuestaPDF/generar.doGet()", "Solicitud de impresión atendida.");
  }
}