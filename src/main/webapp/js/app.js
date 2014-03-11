function salvar(){

	var lamentacao = {nome: $("#nome").val(), message: $("#lamentacao").val()}
	
	$.ajax({
		url: "/lamentacao/salvar",
		data: JSON.stringify(lamentacao),
		dataType: "text",
		contentType: "application/json; charset=utf-8",
		type: 'POST',
		success: function(){
			$('#form-control').val('');
			$("#sucesso").text("Lamentação salva com sucesso").show();
			listar();
		}, 
		error: function(e, str, strerro){
			$("#erro").text("Erro ao salvar Lamentação").show();
		}
	});

}

function listar(){
	
	
	$.ajax({
		url: "/lamentacao/listar",
		success: function(result){
			$('#lamentacoes').html('');
			$.each(result, function(i,v){
				var section = $('<section/>');
				section.append($('<h1/>').text(v.nome + " - " + dateToYMD(v.data)));
				section.append($('<p/>').text(v.message));
				$('#lamentacoes').append(section);
				$('#lamentacoes').append("<hr/>");
			});
		},
		error: function(){
			$("#erro").text("Erro ao listar Lamentações").show();
		}
	});

}

$(function(){
	$('#adicionarButton').click(salvar);
	listar();
});

function dateToYMD(date) {
	date = new Date(Date.parse(date))
    var d = date.getDate();
    var m = date.getMonth() + 1;
    var y = date.getFullYear();
    return (d <= 9 ? '0' + d : d) + '/' + (m<=9 ? '0' + m : m) + '/' + '' + y;
}