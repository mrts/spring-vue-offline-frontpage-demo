Vue.use(VueMaterial)

Vue.component('speaker', {
  props: ['speaker'],
  template:
      `<md-whiteframe md-elevation="3" class="author-whiteframe">
      <div class="author-card">
        <md-avatar class="md-large">
          <img :src="speaker.image">
        </md-avatar>
        <div class="author-card-info">
          <p class="author-name">{{ speaker.name }}</p>
          <p>{{ speaker.bio }}</p>
        </div>
      </div>
    </md-whiteframe>`
})

var App = new Vue({
  el: '#app',
  data: {'speakers': CACHED_DATA},
})
