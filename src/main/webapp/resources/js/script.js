/* Variáveis globais */

var myPic=document.getElementById("myImg");
var myCaption=document.getElementById("titulofoto");

/* mudar cor do texto */
function textoVerde() {
	document.getElementById("texto").style.color="green";
}

/* mudar imagem nas Fotos */
function mudarImagem(n) {
	myPic.src="../resources/images/foto"+n+".jpg";
	myCaption.innerText = n+"/10";
	if (n<10) n++;
	else n=1;
	return n;
}

/* lançar primeira imagens nas Fotos */
function lancaImagem() {
	
myPic.src="../resources/images/foto1.jpg";
myCaption.innerText = "1/10";

var change=2;
myPic.onclick=function() {
	change=mudarImagem(change);

}}

/* carrega a imagem nas Fotos */
myPic.onload=lancaImagem();
