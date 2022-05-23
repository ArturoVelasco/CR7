function addItem(item){
    const itemHTML = '<div class="card" style="width: 400px;">\n' +
        '    <img src="'+item.img +'" class="card-img-top" alt="image">\n' +
        '    <div class="card-body">\n' +
        '        <h5 class="card-title">'+item.name+'</h5>\n' +
        '        <p class="card-text">'+item.description+'</p>\n' +
        '        <a href="#" class="btn btn-primary">Post</a>\n' +
        '    </div>\n' +
        '</div>\n' +
        '<br/>';
    const itemsContainer = document.getElementById("list-items");
    itemsContainer.innerHTML += itemHTML;
}
addItem({'name':'Image',
    'img':'/assets/imagenes/post.png',
    'description':'Add pictures to the post'});

addItem({'name':'Video',
    'img':'/assets/imagenes/video.JPG',
    'description':'add videos to the post '})

addItem({'name':'Feelings',
    'img':'/assets/imagenes/Sentimientos.JPG',
    'description':'add videos to the post '})

addItem({'name':'Poll',
    'img':'/assets/imagenes/poll.JPG',
    'description':'Add  a poll '})

addItem({'name':'Gift',
    'img':'/assets/imagenes/gift.JPG.JPG',
    'description':'Add  a poll '})