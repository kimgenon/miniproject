import com.psm.Position
class BootStrap {
    def init = { servletContext ->
      new Position(positionName: 'Backend').save()
      new Position(positionName: 'Frontend').save()
      new Position(positionName: 'Quality Analyst').save()
      new Position(positionName: 'Business Analyst').save()
    }
    def destroy = {
    }
}
