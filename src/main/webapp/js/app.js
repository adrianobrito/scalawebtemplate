function salvar(){

	var lamentacao = {nome: $("#nome").val(), message: $("#lamentacao").val()}

	$.ajax({
		url: "/lamentacao/salvar",
		data: lamentacao,
		dataType: "json",
		type: 'POST',
		success: function(){
			$('#form-control').val('');
			$("#sucesso").text("Lamentação salva com sucesso").show();
			listar();
		}, 
		error: function(){
			$("#erro").text("Erro ao salvar Lamentação").show();
		}
	})

}

function listar(){
	
	$.ajax({
		url: "/lamentacao/listar",
		success: function(result){
			$('#lamentacoes').html('');
			$.each(result, function(i,v){
				var section = $('<section/>');
				section.append($('<h1/>').text(v.nome + " - " + v.data));
				section.append($('<p/>').text(v.message));
				$('#lamentacoes').append(section);
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