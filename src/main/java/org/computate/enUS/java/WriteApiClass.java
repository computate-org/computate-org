package org.computate.enUS.java;

import java.io.PrintWriter;
import java.util.Collection;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import io.vertx.ext.reactivestreams.ReactiveWriteStream;
import io.vertx.ext.web.RoutingContext;

/**	For retrieving a Java class from Solr and writing the Java class to a file for each language. 
 */
public class WriteApiClass extends WriteGenClass {

	protected PrintWriter auteurApiGenClasse;

	protected String classeNomSimpleApiGen;

	public void  apiCodeClasseDebut(String langueNom) throws Exception {
		o = auteurApiGenClasse;
		l("package ", classeNomEnsemble, ";");
		l();
		if(classeImportationsGenApi.size() > 0) { 
			for(String classeImportation : classeImportationsGenApi) {
				l("import ", classeImportation, ";");
			}
			l();
		}

		tl(0, "");
		ecrireCommentaire(classeCommentaire, 0); 
		s("public abstract class ", classeNomSimpleApiGen);
//		l(" extends HttpServlet {");
		l(" implements Handler<RoutingContext> {");
		l();
		tl(1, "public static final String VAL_virguleEspace = \", \";");
		tl(1, "public static final String VAL_citation = \"\\\"\";");
		tl(1, "public static final String VAL_citationDeuxPointsEspaceCitation = \"\\\": \\\"\";");
		tl(1, "public static final String VAL_citationDeuxPointsEspace = \"\\\": \";");
		tl(1, "public static final String VAL_citationLigne = \"\\\"\\n\";");
		tl(1, "public static final String VAL_ligne = \"\\n\";");
		tl(1, "public static final String VAL_citationVirguleEspaceCitation = \"\\\", \\\"\";");
		tl(1, "public static final String VAL_citationDeuxPointsEspaceGuillmets = \"\\\": [\";");
		tl(1, "public static final String VAL_guillmetsFin = \"]\";");
	}

	public void  apiCodeClasseFin(String langueNom) throws Exception {
		o = auteurApiGenClasse;

		s(wApiChamps.toString());
		l();
		tl(1, "public void handleGet(Vertx vertx, Router router) {");
		tl(2, "router.get(\"/hello\").handler(rc -> {");
		tl(3, "ReactiveWriteStream<SolrDocument> rws = ReactiveWriteStream.writeStream(vertx);");
		tl(3, "ReactiveReadStream<SolrDocument> rrs = ReactiveReadStream.readStream();");
		tl(3, "HttpServerResponse outStream = rc.response();");
		tl(3, "outStream.putHeader(\"content-type\", \"application/json\");");
		tl(3, "rws.subscribe(rrs);");
		tl(3, "SolrDocument doc = null;");
		tl(3, "rws.write(doc);");
		tl(3, "rrs.handler(d -> {");
		tl(4, "if (outStream.writeQueueFull()) {");
		tl(5, "outStream.drainHandler((s) -> {");
		tl(6, "rrs.resume();");
		tl(5, "});");
		tl(5, "rrs.pause();");
		tl(4, "} else {");
		tl(5, "outStream.write(d.toJson());");
		tl(4, "}");
		tl(4, "//}).endHandler(h -> {");
		tl(5, "//outStream.end();");
		tl(4, "//});");
		tl(3, "outStream.end();");
		tl(3, "RequeteSite requeteSite = null;");
		tl(3, "SolrQuery rechercheSolr = genererRecherche(requeteServeur);");
		tl(3, "requeteSite = genererRequeteSite(requeteServeur, reponseServeur);");
		tl(3, "QueryResponse reponseRecherche = requeteSite.ecouteurContexte_.clientSolr.query(rechercheSolr);");
		tl(3, "genererGet(requeteSite, reponseRecherche);");
		tl(3, "});");
		tl(2, "});");
		tl(3, "");
		tl(2, "//RequeteSite requeteSite = null;");
		tl(2, "//try {");
		tl(3, "//SolrQuery rechercheSolr = genererRecherche(requeteServeur);");
		tl(3, "//requeteSite = genererRequeteSite(requeteServeur, reponseServeur);");
		tl(3, "//QueryResponse reponseRecherche = requeteSite.ecouteurContexte_.clientSolr.query(rechercheSolr);");
		tl(3, "//genererGet(requeteSite, reponseRecherche);");
		tl(2, "//} catch(Exception e) {");
		tl(3, "//genererErreur(requeteSite, e);");
		tl(2, "//}");
		tl(1, "}");
//		tl(1, "@Override protected void doGet(HttpServerRequest requeteServeur, HttpServerResponse reponseServeur) throws ServletException, IOException {");
		l();
		tl(1, "@Override protected void doPost(HttpServerRequest requeteServeur, HttpServerResponse reponseServeur) throws ServletException, IOException {");
		tl(2, "RequeteSite requeteSite = null;");
		tl(2, "try {");
		tl(3, "SolrQuery rechercheSolr = genererRecherche(requeteServeur);");
		tl(3, "requeteSite = genererRequeteSite(requeteServeur, reponseServeur);");
		tl(3, "QueryResponse reponseRecherche = requeteSite.ecouteurContexte_.clientSolr.query(rechercheSolr);");
		tl(3, "genererPost(requeteSite, reponseRecherche);");
		tl(2, "} catch(Exception e) {");
		tl(3, "genererErreur(requeteSite, e);");
		tl(2, "}");
		tl(1, "}");
		l();
		tl(1, "public String varIndexe", classeNomSimple, "(String entiteVar) throws Exception {");
		tl(2, "switch(entiteVar) {");
		s(wApiGet.toString());
		tl(3, "default:");
		tl(4, "throw new Exception(String.format(\"\\\"%s\\\" n'est pas une entité indexé. \", entiteVar));");
		tl(2, "}");
		tl(1, "}");
		l();
		tl(1, "public SolrQuery genererRecherche(HttpServerRequest requeteServeur) throws Exception {");
		tl(2, "String entiteVar = null;");
		tl(2, "String valeurIndexe = null;");
		tl(2, "String varIndexe = null;");
		tl(2, "String valeurTri = null;");
		tl(2, "Integer rechercheDebut = null;");
		tl(2, "Integer rechercheNum = null;");
		tl(2, "SolrQuery rechercheSolr = new SolrQuery();");
		tl(2, "rechercheSolr.setQuery(\"*:*\");");
		tl(2, "rechercheSolr.setRows(1000000);");
		tl(2, "rechercheSolr.addSort(\"partNumero_indexed_int\", ORDER.asc);");
		tl(2, "Map<String, String[]> paramMap = (Map<String, String[]>)Collections.list(requeteServeur.getParameterNames()).stream()");
		tl(4, ".collect(Collectors.toMap(parameterName -> parameterName, requeteServeur::getParameterValues));");
		tl(2, "for(String paramCle : paramMap.keySet()) {");
		tl(3, "String[] paramValeurs = paramMap.get(paramCle);");
		tl(3, "for(String paramValeur : paramValeurs) {");
		tl(4, "switch(paramCle) {");

		tl(5, "case \"q\":");
		tl(6, "entiteVar = StringUtils.trim(StringUtils.substringBefore(paramValeur, \":\"));");
		tl(6, "valeurIndexe = StringUtils.trim(StringUtils.substringAfter(paramValeur, \":\"));");
		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
		tl(6, "rechercheSolr.setQuery(varIndexe + \":\" + ClientUtils.escapeQueryChars(valeurIndexe));");
		tl(6, "break;");

		tl(5, "case \"fq\":");
		tl(6, "entiteVar = StringUtils.trim(StringUtils.substringBefore(paramValeur, \":\"));");
		tl(6, "valeurIndexe = StringUtils.trim(StringUtils.substringAfter(paramValeur, \":\"));");
		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
		tl(6, "rechercheSolr.addFilterQuery(varIndexe + \":\" + ClientUtils.escapeQueryChars(valeurIndexe));");
		tl(6, "break;");

		tl(5, "case \"sort\":");
		tl(6, "entiteVar = StringUtils.trim(StringUtils.substringBefore(paramValeur, \" \"));");
		tl(6, "valeurTri = StringUtils.trim(StringUtils.substringAfter(paramValeur, \" \"));");
		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
		tl(6, "rechercheSolr.addSort(varIndexe, ORDER.valueOf(valeurTri));");
		tl(6, "break;");

		tl(5, "case \"fl\":");
		tl(6, "entiteVar = StringUtils.trim(paramValeur);");
		tl(6, "varIndexe = varIndexe", classeNomSimple, "(paramCle);");
		tl(6, "rechercheSolr.addField(varIndexe);");
		tl(6, "break;");

		tl(5, "case \"start\":");
		tl(6, "rechercheDebut = Integer.parseInt(paramValeur);");
		tl(6, "rechercheSolr.setStart(rechercheDebut);");
		tl(6, "break;");

		tl(5, "case \"rows\":");
		tl(6, "rechercheNum = Integer.parseInt(paramValeur);");
		tl(6, "rechercheSolr.setRows(rechercheNum);");
		tl(6, "break;");

		tl(4, "}");
		tl(3, "}");
		tl(2, "}");
		tl(2, "return rechercheSolr;");
		tl(1, "}");
		l();
		tl(1, "public RequeteSite genererRequeteSite(HttpServerRequest requeteServeur, HttpServerResponse reponseServeur) throws Exception {");
		tl(2, "EcouteurContexte ecouteurContexte = (EcouteurContexte)requeteServeur.getServletContext().getAttribute(\"ecouteurContexte\");");

		l();
		tl(2, "RequeteSite requeteSite = new RequeteSite();");
		tl(2, "requeteSite.setEcouteurContexte_(ecouteurContexte);");
		tl(2, "requeteSite.setRequeteServlet(requeteServeur);");
		tl(2, "requeteSite.setReponseServlet(reponseServeur);");
		tl(2, "requeteSite.initLoinRequeteSite(requeteSite);");
		l();

		tl(2, "UtilisateurSite utilisateurSite = new UtilisateurSite();");
		tl(2, "utilisateurSite.initLoinUtilisateurSite(requeteSite);");
		tl(2, "requeteSite.setUtilisateurSite(utilisateurSite);");
		tl(2, "utilisateurSite.setRequeteSite_(requeteSite);");

		tl(2, "return requeteSite;");
		tl(1, "}");
		l();
//		tl(1, "public Integer genererGet", classeNomSimple, "(Integer j, PrintWriter ecrivain, String entiteVarStocke, Collection<Object> champValeurs) throws Exception {");
		tl(1, "public Integer genererGet", classeNomSimple, "(Integer j, String entiteVarStocke, Collection<Object> champValeurs) throws Exception {");
		tl(2, "if(!champValeurs.isEmpty()) {");
		tl(3, "Object champValeur = champValeurs.iterator().next();");
		tl(3, "if(champValeur != null) {");
		s(wApiGenererGet.toString());
		tl(3, "}");
		tl(2, "}");
		tl(2, "return j;");
		tl(1, "}");
		l();
//		tl(1, "public Integer genererPost", classeNomSimple, "(Integer j, PrintWriter ecrivain, String entiteVarStocke, Collection<Object> champValeurs) throws Exception {");
		tl(1, "public Integer genererPost", classeNomSimple, "(Integer j, String entiteVarStocke, Collection<Object> champValeurs) throws Exception {");
		tl(2, "if(!champValeurs.isEmpty()) {");
		tl(3, "Object champValeur = champValeurs.iterator().next();");
		tl(3, "if(champValeur != null) {");
		s(wApiGenererGet.toString());
		tl(3, "}");
		tl(2, "}");
		tl(2, "return j;");
		tl(1, "}");
		l();
		tl(1, "public void genererGet(RequeteSite requeteSite, QueryResponse reponseRecherche) throws Exception {");
		tl(2, "HttpServerResponse reponseServeur = requeteSite.reponseServeur;");
		tl(2, "reponseServeur.write(\"{\\n\");");
		tl(2, "Long millisRecherche = Long.valueOf(reponseRecherche.getQTime());");
		tl(2, "Long millisTransmission = reponseRecherche.getElapsedTime();");
		tl(2, "Long numCommence = reponseRecherche.getResults().getStart();");
		tl(2, "Long numTrouve = reponseRecherche.getResults().getNumFound();");
		tl(2, "Integer numRetourne = reponseRecherche.getResponse().size();");
		tl(2, "String tempsRecherche = String.format(\"%d min, %d sec\", TimeUnit.MILLISECONDS.toSeconds(millisRecherche), TimeUnit.MILLISECONDS.toMillis(millisRecherche) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millisRecherche)));");
		tl(2, "String tempsTransmission = String.format(\"%d min, %d sec\", TimeUnit.MILLISECONDS.toSeconds(millisTransmission), TimeUnit.MILLISECONDS.toMillis(millisTransmission) - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(millisTransmission)));");
		tl(2, "Exception exceptionRecherche = reponseRecherche.getException();");
		tl(2, "SolrDocumentList resultatsRecherche = reponseRecherche.getResults();");
		l();
		tl(2, "reponseServeur.write(\"\\t\\\"numCommence\\\": \");");
		tl(2, "reponseServeur.write(numCommence.toString());");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"numTrouve\\\": \");");
		tl(2, "reponseServeur.write(numTrouve.toString());");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"numRetourne\\\": \");");
		tl(2, "reponseServeur.write(numRetourne);");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"tempsRecherche\\\": \\\"\");");
		tl(2, "reponseServeur.write(tempsRecherche);");
		tl(2, "reponseServeur.write(\"\\\"\");");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"tempsTransmission\\\": \\\"\");");
		tl(2, "reponseServeur.write(tempsTransmission);");
		tl(2, "reponseServeur.write(\"\\\"\");");
		l();
		tl(2, "if(exceptionRecherche != null) {");
		tl(3, "reponseServeur.write(\"\\t, \\\"exceptionRecherche\\\": \\\"\");");
		tl(3, "reponseServeur.write(exceptionRecherche.getMessage());");
		tl(3, "reponseServeur.write(\"\\\"\");");
		tl(2, "}");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"resultats\\\": {\\n\");");
		tl(2, "if(resultatsRecherche != null) {");
		tl(3, "for(Integer i = 0; i < resultatsRecherche.size(); i++) {");
		tl(4, "reponseServeur.write(\"\\t\\t\");");
		tl(4, "if(resultatsRecherche != null && resultatsRecherche.size() > 0)");
		tl(5, "reponseServeur.write(\", \");");
		tl(4, "reponseServeur.write(\"{\\n\");");
		tl(4, "SolrDocument resultatRecherche = resultatsRecherche.get(i);");
		tl(4, "Collection<String> champNoms = resultatRecherche.getFieldNames();");
		tl(4, "Integer j = 0;");
		tl(4, "for(String champNomStocke : champNoms) {");
		tl(5, "Collection<Object> champValeurs = resultatRecherche.getFieldValues(champNomStocke);");
		tl(5, "j = genererGet", classeNomSimple, "(j, reponseServeur, champNomStocke, champValeurs);");
		tl(4, "}");
		tl(4, "reponseServeur.write(\"\\t\\t}\\n\");");
		tl(3, "}");
		tl(2, "}");
		tl(2, "reponseServeur.write(\"\\t}\\n\");");
		l();
		tl(2, "reponseServeur.write(\"}\\n\");");
		tl(1, "}");
		l();
		tl(1, "public void genererPost(RequeteSite requeteSite, QueryResponse reponseRecherche) throws Exception {");
		tl(2, "PrintWriter reponseServeur = requeteSite.reponseServeur;");
		tl(2, "reponseServeur.write(\"{\\n\");");
		tl(2, "Long millisRecherche = Long.valueOf(reponseRecherche.getQTime());");
		tl(2, "Long millisTransmission = reponseRecherche.getElapsedTime();");
		tl(2, "Long numCommence = reponseRecherche.getResults().getStart();");
		tl(2, "Long numTrouve = reponseRecherche.getResults().getNumFound();");
		tl(2, "Integer numRetourne = reponseRecherche.getResponse().size();");
		tl(2, "String tempsRecherche = String.format(\"%d min, %d sec\", TimeUnit.MILLISECONDS.toSeconds(millisRecherche), TimeUnit.MILLISECONDS.toMillis(millisRecherche) - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(millisRecherche)));");
		tl(2, "String tempsTransmission = String.format(\"%d min, %d sec\", TimeUnit.MILLISECONDS.toSeconds(millisTransmission), TimeUnit.MILLISECONDS.toMillis(millisTransmission) - TimeUnit.SECONDS.toSeconds(TimeUnit.MILLISECONDS.toSeconds(millisTransmission)));");
		tl(2, "Exception exceptionRecherche = reponseRecherche.getException();");
		tl(2, "SolrDocumentList resultatsRecherche = reponseRecherche.getResults();");
		l();
		tl(2, "reponseServeur.write(\"\\t\\\"numCommence\\\": \");");
		tl(2, "reponseServeur.write(numCommence.toString());");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"numTrouve\\\": \");");
		tl(2, "reponseServeur.write(numTrouve.toString());");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"numRetourne\\\": \");");
		tl(2, "reponseServeur.write(numRetourne);");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"tempsRecherche\\\": \\\"\");");
		tl(2, "reponseServeur.write(tempsRecherche);");
		tl(2, "reponseServeur.write(\"\\\"\");");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"tempsTransmission\\\": \\\"\");");
		tl(2, "reponseServeur.write(tempsTransmission);");
		tl(2, "reponseServeur.write(\"\\\"\");");
		l();
		tl(2, "if(exceptionRecherche != null) {");
		tl(3, "reponseServeur.write(\"\\t, \\\"exceptionRecherche\\\": \\\"\");");
		tl(3, "reponseServeur.write(exceptionRecherche.getMessage());");
		tl(3, "reponseServeur.write(\"\\\"\");");
		tl(2, "}");
		l();
		tl(2, "reponseServeur.write(\"\\t, \\\"resultats\\\": {\\n\");");
		tl(2, "if(resultatsRecherche != null) {");
		tl(3, "for(Integer i = 0; i < resultatsRecherche.size(); i++) {");
		tl(4, "reponseServeur.write(\"\\t\\t\");");
		tl(4, "if(resultatsRecherche != null && resultatsRecherche.size() > 0)");
		tl(5, "reponseServeur.write(\", \");");
		tl(4, "reponseServeur.write(\"{\\n\");");
		tl(4, "SolrDocument resultatRecherche = resultatsRecherche.get(i);");
		tl(4, "Collection<String> champNoms = resultatRecherche.getFieldNames();");
		tl(4, "Integer j = 0;");
		tl(4, "for(String champNomStocke : champNoms) {");
		tl(5, "Collection<Object> champValeurs = resultatRecherche.getFieldValues(champNomStocke);");
		tl(5, "j = genererPost", classeNomSimple, "(j, reponseServeur, champNomStocke, champValeurs);");
		tl(4, "}");
		tl(4, "reponseServeur.write(\"\\t\\t}\\n\");");
		tl(3, "}");
		tl(2, "}");
		tl(2, "reponseServeur.write(\"\\t}\\n\");");
		l();
		tl(2, "reponseServeur.write(\"}\\n\");");
		tl(1, "}");
		l();
		tl(1, "public void genererErreur(RequeteSite requeteSite, Exception e) {");
		tl(2, "e.printStackTrace();");
		tl(2, "try {");
		tl(3, "MimeMessage message = new MimeMessage(requeteSite.ecouteurContexte_.sessionCourriel);");
		tl(3, "message.setFrom(new InternetAddress(requeteSite.configSite_.mailAdmin));");
		tl(3, "InternetAddress destinaires[] = new InternetAddress[1];");
		tl(3, "destinaires[0] = new InternetAddress(requeteSite.configSite_.mailAdmin);");
		tl(3, "message.setRecipients(Message.RecipientType.TO, destinaires);");
		tl(3, "String nomDomaine = requeteSite.configSite_.nomDomaine;");
		tl(3, "String sujet = nomDomaine + \" erreur \" + \" \" + requeteSite.utilisateurNom + \" \" + requeteSite.requeteServeur.getRequestURI();");
		tl(3, "String corps = ExceptionUtils.getStackTrace(e);");
		tl(3, "message.setSubject(sujet);");
		tl(3, "message.setContent(corps, \"text/plain\");");
		tl(3, "Transport.send(message);");
		tl(3, "String s = e.getMessage();");
		tl(3, "requeteSite.reponseServeur.sendError(500, s);");
		tl(2, "} catch(Exception e2) {");
		tl(3, "e.printStackTrace();");
		tl(2, "}");
		tl(1, "}");
		tl(0, "}");

		System.out.println("Ecrire: " + classeCheminApiGen); 
		auteurApiGenClasse.flush();
		auteurApiGenClasse.close();
	}
}
