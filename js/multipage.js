$(function(){
    $(".page").hide().first().show();
    $(".btn-prev").first().remove();
    $(".btn-next").last().remove();

    $(".btn-next").click(function(){
        $(this).parents(".page").hide().next(".page").show();
    });

    $(".btn-prev").click(function(){
        $(this).parents(".page").hide().prev(".page").show();
    });
});