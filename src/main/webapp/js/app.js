function salvar(){

	var lamentacao = {nome: $("#nome").val(), lamentacao: $("lamentacao").val()}

	$.ajax({
		url: "/lamentacao/salvar",
		data: lamentacao,
		dataType: "json",
		type: 'POST',
		success: function(){
			$("#sucesso").text("Lamentação salva com sucesso").show();
		}, 
		error: function(){
			$("#erro").text("Erro ao salvar Lamentação").show();
		}
	})

}

function listar(){
	$.ajax({
		url: "/lamentacao/listar",
		success: function(){
			$("#sucesso").text("Listagem feita com sucesso").show();
		},
		error: function(){
			$("#erro").text("Erro ao listar Lamentações").show();
		}
	});

}

$(function(){
	listar();
});